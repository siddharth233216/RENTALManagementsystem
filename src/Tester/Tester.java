package Tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.validation.Validations.validateAll;
import com.core.Owner;

public class Tester implements iterable {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Owner> rMap = new HashMap<>(); // restore method should be called here
			boolean exit = false;
			while (!exit) {
				System.out.println("enter choice");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;
					case 1:
						/*
						 * String fName,String lName,String email,String address,int adhar,int
						 * mob,double rent, String prop, String date, Map<Integer,Owner> rentMap
						 */
						System.out.println("enter owner details");
						System.out.println(
								"1.firstName:,2.LastName:,3. email: ,4. address:,5. adhar:, 6. mob:,7. rent:,8.property:,9.date:");
						System.out.println();
						Owner o = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(),
								sc.nextDouble(), sc.next(), sc.next(), rMap);
						rMap.put(o.getAdhar(), o);
						System.out.println("User us added.....");

						break;

					case 2:
						rMap.forEach((k, v) -> System.out.println(v));

						// System.out.println(rMap.values());
						break;

					case 3: 
						rMap.values().stream().sorted().forEach(s-> System.out.println(s));
						break;

					case 4:
						String s = sc.next();
					//	rMap.remove(, o).0
						rMap.values().removeIf(v->v.getAdhar().equals(s));
						
						break;

					case 5:
						break;
					case 6:
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			} // while end

		}

	}
}