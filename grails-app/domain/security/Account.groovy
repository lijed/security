package security

class Account {
	String userName;
	String password
	
	static hasMany = [roles: Role]
	
    static constraints = {
		userName blank:false
		password blank:false 
    }
}
