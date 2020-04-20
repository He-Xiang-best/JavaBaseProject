package chapterProgram;
 
import java.util.Scanner;
 
public class PrintCalender {

    public static void main(String[] args) {
 
	int date = 0; // �����������º����õ���1�ŵ�����
	int day_max = 0;// �����������µ��µ�����
 
	int year = 0;// ����������������
	int month = 0;// ��������������·�
 
	Scanner in = new Scanner(System.in);
	System.out.print("��������ݣ�");
	year = in.nextInt();
	System.out.print("�������·ݣ�");
	month = in.nextInt();
	System.out.println("���������Ϊ��" + year + "-" + month);
	in.close();
 
	int day_sum = 0;
	// ��1900~year֮�����ݽ����ۼ�����
	for (int i = 1900; i < year; i++) {
	    // �ж��Ƿ�������
	    if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
		// ����366��
		day_sum += 366;
	    } else {
		// ƽ��365��
		day_sum += 365;
	    }
	} 
 
	// ���·ݽ����ۼӼ���
	for (int i = 1; i < month; i++) {
	    switch (i) {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
		day_max = 31;
		day_sum += 31;
		break;
	    case 2:
		// �ж��Ƿ�������
		if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0))) {
		    // ����2��29
		    day_sum += 29;
		} else {
		    // ƽ��2��28
		    day_sum += 28;
		}
		break;
	    default:
		day_sum += 30;
		break;
	    }
	} // for
 
	date = 1 + day_sum % 7; // �����������ڼ���õ�������,1900��1��1������һ
	System.out.println("���������Ϊ��" + year + "-" + month + ",����µ�1��������" + date);
	// ����������գ���ͷ�� ���ÿճ�������
	// �˴�֮��date������ʾ����1��ǰ���Ʊ���ĸ���
	if (date == 7) {
	    date = 0;
	}
	// �ж�����·ݶ�����
	switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	    day_max = 31;
	    break;
	case 2:
	    // �ж��Ƿ�������
	    if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0))) {
		// ����2��29
		day_max = 29;
	    } else {
		// ƽ��2��28
		day_max = 28;
	    }
	    break;
	default:
	    day_max = 30;
	    break;
	}
	System.out.println("==================================================");
 
	// �����ͷ
	System.out.print("��\tһ\t��\t��\t��\t��\t��\n");
 
	int day = 1;// ��ӡ������
 
	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 7; j++) {
		// ��ӡ��һ�е�ʱ�򣬿ճ�ǰdate���ռ�
		if (i == 0 && j < date) {
		    System.out.print("\t");
		    // ������ǰ��ѭ��
		    continue;
		}
 
		if (day > day_max) {
		    break;
		}
		System.out.print(day + "\t");
		day++;
	    }
	    // ��ӡ��һ�к���
	    System.out.println();
	}
	System.out.println("==================================================");
    }
 
}