package com.example.praktikumwireframe

data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val colorRes: Int,
    val imageRes: Int
)

object FoodData {
    val foodList = listOf(
        FoodItem(1, "Tamago Nigiri", "Nasi dengan telur dadar manis di atasnya", "Rp 42.000", R.color.soySauce,R.drawable.tamagonigiri),
        FoodItem(2, "Shoyu Ramen", "Ramen kuah soy sauce klasik dengan telur ajitsuke", "Rp 38.000", R.color.soySauce,R.drawable.shoyuramen),
        FoodItem(3, "Miso Ramen", "Ramen kuah miso hangat dengan jagung manis dan butter", "Rp 40.000", R.color.soySauce,R.drawable.misoramen),
        FoodItem(4, "Spicy Tan Tan Men", "Ramen pedas dengan pasta wijen dan daging cincang", "Rp 45.000", R.color.soySauce,R.drawable.spicytantanmen),
        FoodItem(5, "Chicken Karaage", "Ayam goreng Jepang crispy dengan saus mayo", "Rp 28.000", R.color.soySauce,R.drawable.chickenkaraage),
        FoodItem(6, "Gyoza 6pcs", "Dumpling Jepang dengan isian daging dan sayur", "Rp 25.000", R.color.soySauce,R.drawable.gyoza),
        FoodItem(7, "Yakitori Set", "4 tusuk ayam bakar dengan saus teriyaki khas Jepang", "Rp 32.000", R.color.soySauce,R.drawable.yakitoriset),
        FoodItem(8, "Edamame", "Kacang kedelai Jepang rebus dengan garam laut", "Rp 18.000", R.color.soySauce,R.drawable.edamame),
        FoodItem(9, "Chicken Teriyaki Don", "Nasi dengan ayam teriyaki, telur, dan sayuran", "Rp 35.000", R.color.soySauce,R.drawable.chikenteriyakidon),
        FoodItem(10, "Katsu Curry Rice", "Nasi kari Jepang dengan chicken katsu crispy", "Rp 40.000", R.color.soySauce,R.drawable.katsucurryrice),
        FoodItem(11, "Vegetable Tempura", "Sayuran goreng tepung crispy dengan saus tentsuyu", "Rp 30.000", R.color.soySauce,R.drawable.vegetabletempura),
        FoodItem(12, "Salmon Teriyaki", "Salmon bakar dengan saus teriyaki dan nasi", "Rp 48.000", R.color.soySauce,R.drawable.salmonteriyaki),
        FoodItem(13, "California Roll", "Sushi gulung isi crab stick, alpukat, dan timun segar", "Rp 38.000", R.color.soySauce,R.drawable.californiaroll),
        FoodItem(14, "Unagi Nigiri", "Sushi nasi dengan belut panggang saus manis gurih", "Rp 55.000", R.color.soySauce,R.drawable.unaginigiri),
        FoodItem(15, "Aburi Salmon Roll", "Sushi isi salmon setengah bakar dengan saus creamy", "Rp 50.000", R.color.soySauce,R.drawable.aburisalmonroll)
    )
}
