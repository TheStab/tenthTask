package code.with.cal.cardviewrecyclerviewtutorial

var itemList = mutableListOf<Item>()

data class Item(

    var image: Int,
    var title: String,
    var price: String,
    var categoryType: String,

    var id:Int = itemList.size
)