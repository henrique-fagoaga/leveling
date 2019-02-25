class Student {
	private String name;
	private String cpf;
	private int rm;

	public String getName() {
		return this.name;
	}

	public String getNameUpper() {
		return this.getName().toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public Student() {}

	public Student(String name, String cpf, int rm) {
		this.name = name;
		this.cpf = cpf;
		this.rm = rm;
	}
}

class Sushi {
	public static void main(String args[]) {
		Student student = new Student("Rafael dos vi-Kings", "133.133.133-40", 83418);
		System.out.println("Sushi with %s".format(student.getNameUpper()));
	}
}
