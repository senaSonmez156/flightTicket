package flightTicket;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		int km=scan.nextInt();
		System.out.print("Yaşınızı giriniz: ");
		int age=scan.nextInt();
		System.out.print("Yolculuk tipiniz:Tek gidiş(1) Gidiş-Dönüş(2):  ");
		int tip=scan.nextInt();
		
		double discountAge=0;
		double normalAmount=km*0.10;
		double discountAmount=0;
		double doubleTicket=0;
		double discountedAge=0;
		
		
		switch(tip) {
		case 1:
			if(age>=0&&age<=11) {
				
				discountAge=normalAmount*0.50;
				discountAmount=normalAmount-discountAge;
				System.out.print("Tutar: "+ discountAmount+"TL");
			}
			else if(age<=12 && age>=24) {
				
				discountAge=normalAmount*0.10;
				discountAmount=normalAmount-discountAge;
				System.out.print("Tutar: "+ discountAmount+"TL");
			}
			else if(age>=25 && age<=64) {
				
				System.out.print("Tutar: "+ normalAmount+"TL");
			}
			else if(age<=105 && age>=65) {
				
				discountAge=normalAmount*0.30;
				discountAmount=normalAmount-discountAge;
				System.out.print("Tutar: "+ discountAmount+"TL");
			}
			break;
		case 2:
			
			if(age>=0&&age<=11) {
				
				discountAge=normalAmount*0.50;
				discountedAge=normalAmount-discountAge;
				doubleTicket=discountedAge*0.20;
				discountAmount=2*(normalAmount-(discountAge+doubleTicket));
				System.out.print("Tutar: "+ discountAmount+"TL");
			}
			
			else if(age>=12&&age<=24) {
				
				discountAge=normalAmount*0.10;
				discountedAge=normalAmount-discountAge;
				doubleTicket=discountedAge*0.20;
				discountAmount=2*(normalAmount-(discountAge+doubleTicket));
				System.out.print("Tutar: "+ discountAmount+"TL");
			}
			
			else if(age>=25 && age<=64) {
				
				doubleTicket=normalAmount*0.20;
				discountAmount=2*(normalAmount-(discountAge+doubleTicket));
				System.out.print("Tutar: "+ discountAmount+"TL");
			}
			
			else if(age>=65&&age<=105) {
				
				discountAge=normalAmount*0.30;
				discountedAge=normalAmount-discountAge;
				doubleTicket=discountedAge*0.20;
				discountAmount=2*(normalAmount-(discountAge+doubleTicket));
				System.out.print("Tutar: "+ discountAmount+"TL");
			}
			break;
		case 3:
			if(tip!=1 && tip!=2) {
				System.out.println("Bilgileriniz hatalıdır.");
			}
			break;
		}
	
		
	
			
			


	}

}
