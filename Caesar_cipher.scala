object assignment4{
  var original = "rashmika lakshan"
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encode = (c:Char, a:String, key:Int) =>
    if(a.contains(c.toUpper))
      a((a.indexOf(c.toUpper)+key)%a.size)
    else
      c

  val decode = (c:Char, a:String, key:Int) =>
    encode(c, a, -key)

  val cipher = (algo:(Char, String, Int) => Char, s:String, a:String, key:Int) =>
    s.map(algo(_, a, key))

  val encrypted = cipher(encode,original,alphabet,1)
  val decrypted = cipher(decode,encrypted,alphabet,1)

  def main(args: Array[String]) = {
    println("Original text : " + original)
    println("Encrypted text : " + encrypted)
    println("Decrypted text : " + decrypted)
  }
}
