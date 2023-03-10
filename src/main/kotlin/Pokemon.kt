class Pokemon(
    private var name: String = "Pok",
    private var attackPower: Float = 30f,
    private var life: Float = 100f
) {
    fun Pokemon(n: String, ap: Float) {
        this.name = n
        this.attackPower = ap
        this.life = 100f
    }

    fun getName(): String {
        return  this.name
    }
    fun getattackPower(): Float {
        return this.attackPower
    }
    fun getlife(): Float {
        return this.life
    }
    fun setattackPower(attackPower:Float){
        this.attackPower = attackPower
    }
    fun setName(name:String){
        this.name = name
    }
    fun setlife(life:Float){
        this.life = life
    }
}