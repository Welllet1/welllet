public class Main{
	public static void main(String[] args) {

		Place bed = new Place("кровать");
		LilBoy boy = new LilBoy("Малыш", 5, Sex.MALE);
		Carlson carlson = new Carlson("Карлсон", 65, Sex.MALE);
		MissBock missbock = new MissBock("Фрекен Бок", 17, Sex.FEMALE);
		
		carlson.say("Скарлатина -- дело житейское и беспокоиться здесь ровным счетом не о чем. Да и к тому же очень удачно, что болезнь отправила Боссе и Бетан в больницу именно в тот день, когда в доме появится привидение.");
		missbock.walkAround();
		boy.listen(missbock);
		carlson.lie();
		carlson.hide(carlson, bed);
		boy.hide(carlson, bed);
	}

}