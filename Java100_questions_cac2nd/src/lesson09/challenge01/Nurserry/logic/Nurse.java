package lesson09.challenge01.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void takeAttendance(NurserySchoolChild[] childs, int num) {

		//ここに適切な処理を記述
		try {
			System.out.println(childs[num].getName() + "番の園児は登園しています。");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("その番号の園児は出席してません。");
		}

	}
}
