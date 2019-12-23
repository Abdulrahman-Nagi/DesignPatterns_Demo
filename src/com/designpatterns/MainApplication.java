package com.designpatterns;

import com.designpatterns.behavioral.command.*;
import com.designpatterns.behavioral.iterator.BagInventory;
import com.designpatterns.behavioral.iterator.HandHeldInventory;
import com.designpatterns.behavioral.iterator.Item;
import com.designpatterns.behavioral.iterator.IteratorInventory;
import com.designpatterns.behavioral.observer.*;
import com.designpatterns.behavioral.state.Gate;
import com.designpatterns.behavioral.strategy.Context;
import com.designpatterns.behavioral.strategy.OperationAdd;
import com.designpatterns.behavioral.strategy.OperationSubtract;
import com.designpatterns.behavioral.template.AppUser;
import com.designpatterns.behavioral.template.Post;
import com.designpatterns.creational.abstractfactory.*;
import com.designpatterns.structural.adapter.*;
import com.designpatterns.structural.bridge.*;
import com.designpatterns.structural.composite.Project;
import com.designpatterns.structural.composite.ToDo;
import com.designpatterns.structural.composite.TodoList;
import com.designpatterns.structural.decorator.BasicCar;
import com.designpatterns.structural.decorator.Car;
import com.designpatterns.structural.decorator.LuxuryCar;
import com.designpatterns.structural.decorator.SportsCar;
import com.designpatterns.structural.facade.FacadeHelper;
import com.designpatterns.structural.proxy.ProxyStringParser;

import java.util.ArrayList;
import java.util.List;

public class MainApplication  {


    public static void main(String[] args) {



                // Observable Pattern


        System.out.println("** Observable Pattern **");


		WeatherStation weatherStation = new WeatherStation();


		IObservers phone = new PhoneDisplay(weatherStation);
		IObservers home = new HomeDisplay(weatherStation);
		IObservers street=new StreetDisplay(weatherStation);

		weatherStation.add(phone);
		weatherStation.add(home);
		weatherStation.add(street);

		weatherStation.setWeatherTemp(37);


		weatherStation.notifyObservers();






		weatherStation.setWeatherTemp(40);

		weatherStation.notifyObservers();


        System.out.println("** Ending Of Observable Pattern**");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");




		// Strategy Pattern


		System.out.println(" ** Strategy Pattern ** ");



		Context context = new Context( new OperationAdd());

		context.executeStrategy(2,5);


		System.out.println("==========================");

		context = new Context(new OperationSubtract());

		context.executeStrategy(2,5);


        System.out.println("** Ending of Strategy Pattern**");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");


		// Command Pattern


		System.out.println(" ** Command  Pattern **");


		Speaker speaker = new Speaker();
		Light light = new Light();

		Invoker invoker = new Invoker(new SpeakerCommand(speaker),new LightCommand(light));

		invoker.clickWelcome();

		invoker.clickBye();

		invoker.clickLightOn();

		invoker.clickLightOff();


		invoker.testAll();


        System.out.println("** Ending of Command Pattern **");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");





		// Template Pattern


        System.out.println("** Template Pattern **");

		AppUser appUser = new AppUser();

		appUser.setUserName("Manootes");
		appUser.setPasword("12");

		appUser.saveRecord();

		System.out.println("======================================");


		Post post = new Post();

		post.setTitle("Mazzika");


		List<String> comments=new ArrayList<>();
		comments.add("Hello");
		comments.add("From");
		comments.add("My");
		comments.add("Post");


		post.setComments(comments);

		post.saveRecord();


        System.out.println("** Ending of Template Pattern**");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");



	// iterator pattern


        System.out.println("** Iterator Pattern **");


		Item sword=new Item();
		sword.setItemName("Sword");

		Item gun=new Item();
		gun.setItemName("Gun");

		HandHeldInventory handHeldInventory =new HandHeldInventory();

		handHeldInventory.setLeftHand(sword);
		handHeldInventory.setRightHand(gun);

		IteratorInventory hhIterator =handHeldInventory.getIterator();


		while (hhIterator.isDone()) {

			System.out.println(hhIterator.getCurrentItem().getItemName());
			hhIterator.next();
		}




		Item item1 = new Item();
		item1.setItemName("Apple");

		Item item2 = new Item();
		item2.setItemName("Meat");

		Item item3 = new Item();
		item3.setItemName("Water");

		List<Item> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		items.add(item3);


		BagInventory bagInventory = new BagInventory();
		bagInventory.setBagItems(items);


		IteratorInventory iteratorInventory = bagInventory.getIterator();


		while (iteratorInventory.isDone()) {

			System.out.println(iteratorInventory.getCurrentItem().getItemName());

			iteratorInventory.next();
		}


        System.out.println("** Ending of Iterator Pattern **");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");


		// State Pattern//


        System.out.println("** State Pattern **");


        Gate gate = new Gate();

		gate.enter();

		gate.pay();

		gate.payFailed();



		gate.payOK();

		gate.enter();


		gate.pay();

		gate.payOK();

		gate.enter();

		gate.enter();

		gate.pay();

		gate.payFailed();

		gate.enter();

		gate.enter();


        System.out.println("** Ending of State Pattern **");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");

		// Abstract Factory Pattern


        System.out.println("** Abstract Factory Pattern **");


		 SamsungMobile s9plus = new SamsungMobile();

		s9plus.setItemCode(203040);
		s9plus.setItemName("Galaxy S9 plus");

		SamsungCharger s9charger=new SamsungCharger();

		s9charger.setChargerCode(3040);
		s9charger.setChargerName("S9 plus Charger");


		HuaweiMobile mate20pro=new HuaweiMobile();
		mate20pro.setItemCode(102030);
		mate20pro.setItemName("Mate 20 Pro");


		HuaweiCharger mate20procharger = new HuaweiCharger();

		mate20procharger.setChargerCode(2030);
		mate20procharger.setChargerName("Mate 20 Pro Charger");



		MobilePackage s9Package=new MobilePackage(s9plus,s9charger);

		MobilePackage mate20proPackage =new MobilePackage(mate20pro,mate20procharger);


		System.out.println(s9Package.getMobileType().getItemName());

		System.out.println(mate20proPackage.getMobileType().getItemName());


        System.out.println("** Ending of Abstract Factory Pattern **");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");


		//Adapter Pattern


        System.out.println("** Adapter Pattern**");



		ITarget main = new MainApp();

		main.doAction();

		Plugin plugin = new Plugin();

		main = new Adapter(plugin);

		main.doAction();

		PluginTwo pluginTwo = new PluginTwo();

		main=new Adapter(pluginTwo);

		main.doAction();


        System.out.println("** Ending of Adapter Pattern**");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");


		// Facade Pattern


        System.out.println("** Facade Pattern **");

        FacadeHelper facade = new FacadeHelper();


		System.out.println(facade.getLaptopBundle());

		System.out.println(facade.getMobileBundle());


        System.out.println("** Ending of Facade Pattern**");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");

		// Decorator Patter


        System.out.println("** Decorator Pattern**");

		Car basicCar= new BasicCar();
		basicCar.assemble();

		System.out.println("\n===========");

		Car sportsCar = new SportsCar(new BasicCar());

		sportsCar.assemble();


		System.out.println("\n=============");

		Car luxuryCar = new LuxuryCar(new BasicCar());

		luxuryCar.assemble();


		System.out.println("\n=============");

		Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));

		luxurySportsCar.assemble();


        System.out.println("** Ending of Decorator Pattern**");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");


			// Proxy Pattern

        System.out.println("** Proxy Pattern **");

         ProxyStringParser parser = new ProxyStringParser("abdulrahman");

		System.out.println(parser.getNumChars());


		System.out.println(parser.getNumChars());


        System.out.println("** Ending of Proxy Pattern**");


        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");


		 // Bridge Pattern


        System.out.println("** Bridge Pattern**");

        Article article = new Article();
		article.setImage("Article Image");
		article.setTitle("Article Title");


		Book book = new Book();
		book.setImage("Book Image");
		book.setTitle("Book Title");

		ArticleResource articleResource = new ArticleResource(article);

		BookResource bookResource = new BookResource(book);

		LongFormView longFormViewArticle = new LongFormView(articleResource);

		System.out.println(longFormViewArticle.show());


		LongFormView longFormViewBook = new LongFormView(bookResource);


		System.out.println(longFormViewBook.show());

		ShortFormView shortFormViewArticle = new ShortFormView(articleResource);


		System.out.println(	shortFormViewArticle.show());


		ShortFormView shortFormViewBook = new ShortFormView(bookResource);

		System.out.println(shortFormViewBook.show());


        System.out.println("** Ending of Bridge Pattern**");

        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");





		// Composite Pattern


        System.out.println("** Composite Pattern **");

        ToDo todo1 = new ToDo("sub Todo1");

        ToDo toDo2 = new ToDo("sub Todo2");

        ToDo toDo3 = new ToDo("sub Todo3");


        List<TodoList> todoListList = new ArrayList<>();

        todoListList.add(todo1);
        todoListList.add(toDo2);
        todoListList.add(toDo3);


        Project project = new Project("Second Todo",todoListList);

        List <TodoList> todoListlist2 = new ArrayList<>();

        todoListlist2.add(toDo2);
        todoListlist2.add(project);
        todoListlist2.add(toDo3);

        Project project1 = new Project("Main Todo",todoListlist2);



        System.out.println(project1.getHTML());


        System.out.println("** Ending of Composite Pattern**");

        System.out.println("*****************************************\n");
        System.out.println("*****************************************\n");


    }
}
