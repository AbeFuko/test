
public class Test {

	public static void main(String[] args) {

		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "09011110000";
		taro.address = "taro@gmail.com";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();


		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "09022220000";
		jiro.address = "jiro@gmail.com";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();


		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "09033330000";
		hanako.address = "hanako@gmail.com";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();


		Person fuko = new Person();
		fuko.name = "阿部楓子";
		fuko.age = 22;
		fuko.phoneNumber = "09044440000";
		fuko.address = "fuko@gmail.com";

		System.out.println(fuko.name);
		System.out.println(fuko.age);
		System.out.println(fuko.phoneNumber);
		System.out.println(fuko.address);
		fuko.talk();
		fuko.walk();
		fuko.run();



		Robot aibo = new Robot();
		aibo.name = "aibo";

		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();


		Robot asimo = new Robot();
		asimo.name = "asimo";

		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();


		Robot pepper = new Robot();
		pepper.name = "pepper";

		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
