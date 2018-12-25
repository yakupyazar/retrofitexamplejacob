package com.google.jacobretrokotlinapplication

data class Hotels(var hotelName:String,
                  var price:String,
                  var information:String,
                  var city:String)

//Burası bizim model class'ımız, Otel Adı, Fiyatı, Otel Bilgisi ve Şehir bilgisini içeren bir model oluşturduk.
//Retrofit ile çektiğimiz response'u bu modelden türettiğimiz list'e aktaracağız.