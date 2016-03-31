import java.util.*;
public class huawei {

	public static void main(String[] args) {
		class Stu {
			String NAME;
			String MATH;
			String LANG;
		}
		Scanner scanner = new Scanner(System.in);
		List<Stu> stus = new LinkedList<Stu>();
		while (scanner.hasNext()) {
			String start = scanner.nextLine();
			String b = start.substring(0, 10);
			start.startsWith("NAME",6);
			// System.out.println(b);
			if (b.equals("LOD GRADE:")) {
				String[] grade = start.split(",|;");
				// System.out.println(grade[0]);
				// System.out.println(grade[1]);
				// System.out.println(grade[2]);
				Stu stu = new Stu();
				if (grade[0].substring(10, 15).equals("NAME=")) {
					stu.NAME = grade[0].substring(15, grade[0].length());
				}
				if (grade[1].substring(0, 5).equals("MATH=")) {
					stu.MATH = grade[1].substring(5, grade[1].length());
				}
				if (grade[2].substring(0, 5).equals("MATH=")) {
					stu.MATH = grade[2].substring(5, grade[2].length());
				}
				if (grade[1].substring(0, 5).equals("LANG=")) {
					stu.LANG = grade[1].substring(5, grade[1].length());
				}
				if (grade[2].substring(0, 5).equals("LANG=")) {
					stu.LANG = grade[2].substring(5, grade[2].length());
				}
				stus.add(stu);
			}
			// for(int i =0;i<stus.size();i++){
			// System.out.println("LOD GRADE:NAME="+stus.get(i).NAME+","+"MATH="+stus.get(i).MATH+",LANG="+stus.get(i).LANG+";");
			// }

			if (b.equals("LST GRADE:")) {
				String name = start.substring(15, start.length() - 1);
				// System.out.println(name);
				int rankmath = 1;
				int ranklang = 1;
				int ranksum = 1;
				for (int i = 0; i < stus.size(); i++) {
					if (stus.get(i).NAME.equals(name)) {
						for (int j = 0; j < stus.size(); j++) {
							if (Integer.parseInt(stus.get(i).MATH) < Integer.parseInt(stus.get(j).MATH)) {
								rankmath++;
							}
							if (Integer.parseInt(stus.get(i).LANG) < Integer.parseInt(stus.get(j).LANG)) {
								ranklang++;
							}
							int sum = Integer.parseInt(stus.get(i).MATH) + Integer.parseInt(stus.get(i).LANG);
							if (sum < Integer.parseInt(stus.get(j).LANG) + Integer.parseInt(stus.get(j).MATH)) {
								ranksum++;
							}
						}
						int sum = Integer.parseInt(stus.get(i).MATH) + Integer.parseInt(stus.get(i).LANG);
						System.out.print(stus.get(i).NAME + " " + stus.get(i).MATH + " " + stus.get(i).LANG + " " + sum + " " + rankmath + " " + ranklang + " " + ranksum);
					}
				}
			}
		}
	}
}
