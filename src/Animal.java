public abstract class Animal {
    private int type;
    private String name;
    private String color;
    private String food;
    private int age;
    private String sex;
    private String owner;
    private  String comment;

    public Animal (int type, String name, String color, String food,
                   int age, String sex, String owner, String comment){
        this.type = type;
        this.name = name;
        this.color = color;
        this.food = food;
        this.age = age;
        this.sex = sex;
        this.owner = owner;
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", food='" + food + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", owner='" + owner + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public abstract void sayHello();
}
