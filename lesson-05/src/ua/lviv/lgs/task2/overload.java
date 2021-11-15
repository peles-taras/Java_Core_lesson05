package ua.lviv.lgs.task2;

public class overload {

	private int i;
	private double d;
	private String s;

	public overload() {
		this(0, 0);
	}

	public overload(int i, double d) {
		this(1, 1.1, "asd");
	}

	public overload(int i, double d, String s) {
		this.i = i;
		this.d = d;
		this.s = s;

	}

}
