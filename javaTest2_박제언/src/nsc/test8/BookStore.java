package nsc.test8;

import ncs.test7.Book;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata = new Book();
		{
			bookdata = new Book("IT", "SQL PLUS", 50000, 5.0);									//�� �ʱ�ȭ 
		}

		BookUpdate bookupdate = new BookUpdate();												//�Ͼ��� ����
		bookupdate = new BookUpdate(bookdata);													//�Ͼ��� �ʱ�ȭ. �� �̿�

		System.out.println("�⺻ ����");
		System.out.println(bookdata.getBookName() + "\t" + bookdata.getBookPrice());			// �� �̸�, �⺻ ���� ���

		System.out.println("����� ����");
		bookdata = bookupdate.updataBookPrice();												//�Ͼ��� .�� ���������̽� ���� ���� ��ȯ�ؼ� �Ͽ� ����
		System.out.println(bookdata.getBookName() + "\t" + bookdata.getBookPrice());
	}

}
