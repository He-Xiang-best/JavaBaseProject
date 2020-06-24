package ex06;

public class J_Grid15
{
    int [ ] [ ] m_board;

    J_Grid15( )
    {
        m_board= new int[3][3];
    } // J_Grid15构造方法结束

    // 输出棋盘的格线行
    private void mb_outputGridRowBoard( )
    {
        int i;
        System.out.print("+");
        for (i=0; i<5; i++)
            System.out.print("-");
        System.out.println("+");
    } // 方法mb_outputGridRowBoard结束

    // 输出棋盘的数据行(第i行, i只能为0, 1 或 2)
    private void mb_outputGridRowBoard(int i)
    {
        int j;
        for (j=0; j < m_board[i].length; j++)
            System.out.print("|" + m_board[i][j]);
        System.out.println("|");
    } // 方法mb_outputGridRowBoard结束

    // 输出棋盘
    public void mb_outputGrid( )
    {
        int i;
        mb_outputGridRowBoard( );
        for (i=0; i < m_board.length; i++)
        {
            mb_outputGridRowBoard(i);
            mb_outputGridRowBoard( );
        } // for循环结束
    } // 方法mb_outputGrid结束

    // 初始化数据
    private void mb_dataInit( )
    {
        int i, j, k;
        for (i=0, k=1; i < m_board.length; i++)
        for (j=0; j < m_board[i].length; j++, k++)
            m_board[i][j]= k;
    } // 方法mb_dataInit结束
    
    // 数据结束检测
    // 返回值说明: 当数据为最后一个数据时，返回true；否则，返回false
    private boolean mb_dataEnd( )
    {
        int i, j, k;
        for (i=0, k=9; i < m_board.length; i++)
            for (j=0; j < m_board[i].length; j++, k--)
                if (m_board[i][j]!= k)
                    return(false);
        return(true);
    } // 方法mb_dataEnd结束

    // 取下一个数据
    private void mb_dataNext( )
    {
        int i, j;
        for (i= m_board.length-1; i>=0 ; i--)
            for (j= m_board[i].length-1; j>=0 ; j--)
                if (m_board[i][j]==9)
                    m_board[i][j]=1;
                else
                {
                    m_board[i][j]++;
                    return;
                } // if-else结构结束
    } // 方法mb_dataNext结束

    // 数据检测: 判断数据中是否含有相同的数字
    // 当数据中存在相同数字时，返回false; 否则，返回 true
    private boolean mb_dataCheckDifferent( )
    {
        int i, j;
        int [ ] digit= new int [10];
        for (i=0; i < m_board.length; i++)
            for (j=0; j < m_board[i].length; j++)
                digit[m_board[i][j]]= 1;
        for (i=1, j=0; i < digit.length; i++)
            j+=digit[i];
        if (j==9)
            return(true);
        return(false);
    } // 方法mb_dataCheckDifferent结束

    // 数据检测: 各行和是否为15
    // 当各行和均为15时，返回true; 否则，返回false
    private boolean mb_dataCheckSumRow( )
    {
        int i, j, k;
        for (i=0; i < m_board.length; i++)
        {
            for (j=0, k=0; j < m_board[i].length; j++)
                k+= m_board[i][j];
            if (k!=15)
                return(false);
        } // for循环结束
        return(true);
    } // 方法mb_dataCheckSumRow结束

    // 数据检测: 各列和是否为15
    // 当各列和均为15时，返回true; 否则，返回false
    private boolean mb_dataCheckSumColumn( )
    {
        int i, j, k;
        for (i=0; i < m_board.length; i++)
        {
            for (j=0, k=0; j < m_board.length; j++)
                k+= m_board[j][i];
            if (k!=15)
                return(false);
        } // for循环结束
        return(true);
    } // 方法mb_dataCheckSumColumn结束

    private boolean mb_dataCheck( )
    {
        if (!mb_dataCheckDifferent( ))
            return(false);
        if (!mb_dataCheckSumRow( ))
            return(false);
        if (!mb_dataCheckSumColumn( ))
            return(false);
        // 检测对角线之和是否为 15
        if (m_board[0][0]+m_board[1][1]+m_board[2][2]!=15)
            return(false);
        // 检测对角线之和是否为 15
        if (m_board[0][2]+m_board[1][1]+m_board[2][0]!=15)
            return(false);
        return(true);
    } // 方法mb_dataCheck结束

    // 求解并输出棋盘问题
    public void mb_arrange( )
    {
        int n= 1;
        for (mb_dataInit( ); !mb_dataEnd( ); mb_dataNext( ))
        {
            if (mb_dataCheck( ))
            {
                System.out.println("第" + n + "个结果:");
                n++;
                mb_outputGrid( );
            } // if结构结束
        } // for循环结束
    } // 方法mb_arrange结束

    public static void main(String args[ ])
    {
        J_Grid15 a= new J_Grid15( );
        a.mb_arrange( );
    } // 方法main结束
} // 类J_Grid15结束
