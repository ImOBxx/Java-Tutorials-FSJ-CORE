


	public class Box {
	    private int length;
	    private int width;
	    private int height;

	    // Constructor 1: No parameters, constructs a default 1x1x1 box
	    public Box() {
	        this.length = 1;
	        this.width = 1;
	        this.height = 1;
	    }

	    // Constructor 2: One parameter, creates a cube of specified size
	    public Box(int size) {
	        this.length = size;
	        this.width = size;
	        this.height = size;
	    }

	    // Constructor 3: Three parameters, custom dimensions for the box
	    public Box(int length, int width, int height) {
	        this.length = length;
	        this.width = width;
	        this.height = height;
	    }

	    // Method to display dimensions of the box
	    public void displayDimensions() {
	        System.out.println("Dimensions: " + length + " x " + width + " x " + height);
	    }

	    public static void main(String[] args) {
	        Box defaultBox = new Box(); // Uses Constructor 1
	        Box cubeBox = new Box(5); // Uses Constructor 2
	        Box customBox = new Box(2, 3, 4); // Uses Constructor 3

	        defaultBox.displayDimensions(); // Outputs: Dimensions: 1 x 1 x 1
	        cubeBox.displayDimensions(); // Outputs: Dimensions: 5 x 5 x 5
	        customBox.displayDimensions(); // Outputs: Dimensions: 2 x 3 x 4
	    }
	}


