package Off_pic.Stack_and_Queue.DogCatQueue;

public class DogCatQueue {
	private Pet pet;
	private long count;
	
	public DogCatQueue (Pet pet,long count){
		this.pet=pet;
		this.count=count;
	}
	
	public Pet getPet(){
		return this.pet;
	}
	
	public long getCount(){
		return this.count;
	}
	
	public String getEnterPetType(){
		return this.pet.getPetType();
	}

}
