package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub         
		Scanner sc = new Scanner(System.in);
		
	    //nhập thông tin sinh viên 
		System.out.println("THONG TIN SINH VIEN" );
		System.out.println("nhap ten cua sinh vien: ");
		String ten = sc.nextLine();
		
		System.out.println("nhap ma sinh vien: ");
		String masinhvien = sc.nextLine(); // mã sinh viên 		
		System.out.println("nhap chung minh nhan dan: ");		
		String cmnd = sc.nextLine(); // chứng minh nhân dân 		
		System.out.println("nhap ten lop:");	
		String lop = sc.nextLine(); //lớp			
		System.out.println("nhap ten truong:");
		String truong = sc.nextLine(); //trường
		System.out.println("nhap diem trung binh: ");
		String DTB = sc.nextLine(); //điểm trung bình
		// nhập thông tin công nhân 
		System.out.println("ten sinh vien: " + ten);
		System.out.println("ma sinh vien: " + masinhvien);
		System.out.println("chung minh nhan dan: " + cmnd);
		System.out.println("lop: " + lop);
		System.out.println("truong: " + truong);
		System.out.println("diem trung binh: " + DTB);
		System.out.println("------------------------------");
		//Nhập thông tin công nhân
		System.out.println("nhap thong tin cong nhan");
		System.out.println("nhap ten: ");
		String tencongnhan = sc.nextLine();
		System.out.println("nhap dia chi: ");
		String locate = sc.nextLine();
		System.out.println("nhap so dien thoai: ");
		String SDT = sc.nextLine();
		System.out.println("nhap he so luong: ");
		String hesoluong = sc.nextLine();
		System.out.println("ten cong nhan: " + tencongnhan);
		System.out.println("dia chi: " + locate);
		System.out.println("so dien thoai: " + SDT);
		System.out.println("he so luong: " + hesoluong);
		System.out.println("----------------------");
		//nhap thong tin mot chiec xe car
		System.out.println("Nhap thong tin mot chiec xe car");
		System.out.println("nhap ten xe: ");
		String tenxe = sc.nextLine();
		System.out.println("nhap ten hang xe:");
		String hang = sc.nextLine();
		System.out.println("nhap gia xe");
		String gia = sc.nextLine();
		System.out.println("nhap mau son xe:");
		String mauson = sc.nextLine();
		System.out.println("ten xe: " + tenxe);
		System.out.println("hang xe: " + hang);
		System.out.println("gia xe: " + gia);
		System.out.println("mau son: " + mauson);
		
		
		
		
		
		
		
		
				
	}
}
