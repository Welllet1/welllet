class LilBoy extends Human implements Listenable, Hideable {
		
		public LilBoy() {
			super();
		}
		
		public LilBoy(String name, int age, Sex sex) {
			super(name, age, sex);
		}
		
		public void flinch() { System.out.println(this.getName() + " вздрогнул");}
		
		public void listen(Human human) {
			
			if (human.getStatus() == Status.WALKING && human.getName() == "Фрекен Бок") {
				this.flinch();
			} else {
				System.out.println(this.getName() + " не услышал ничего страшного");
			}
			
		}
		
		public void hide(Human human, Place place) {
			
			if (place.addHuman(human)) {
				System.out.println(this.getName() + " спрятал " + human.getName() + " в месте " + place.getName());
			}
			
		}
		
	}