package security

class Role {
	String name;
	
    static constraints = {
		name blank: true, unique: true
    }
}
