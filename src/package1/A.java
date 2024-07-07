package package1;

class Man {
    
    int health = 50;
    Gun b = new Gun();
    
    public static void main(String[] args) {
        
        Man a = new Man();
        System.out.println(a.health);
        System.out.println(a.b.bullet);
        
        a.shoot();
        a.shoot();
        a.shoot();
        
    }
    
    public void shoot(){
        
        System.out.println("Shoot");
        b.bullet = b.bullet - 1;
        System.out.println(b.bullet);
        
    }
    
}

class Gun {
    
    int bullet = 10;
    
}