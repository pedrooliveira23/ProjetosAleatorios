package numeros;

public class main {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		int[] num = new int[5];
		boolean p = false;

		while (p == false) {
			num[0] = (int) (Math.random() * 10);
			num[1] = (int) (Math.random() * 10);
			num[2] = (int) (Math.random() * 10);
			num[3] = (int) (Math.random() * 10);
			num[4] = (int) (Math.random() * 10);

			if ((num[4] + num[2] == 14) && (num[3] == num[1] + 1) && (num[0] == 2 * num[1] - 1)
					&& (num[1] + num[2] == 10) && (num[0] + num[1] + num[2] + num[3] + num[4] == 30)) {
				p = true;
			}
		}

		long fim = System.currentTimeMillis();
		System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4] +"\nTempo: " + (inicio-fim));
	}

}
