/**
--- Day 1: Inverse Captcha ---

The night before Christmas, one of Santa's Elves calls you in a panic. "The printer's broken! We can't print the Naughty or Nice List!" By the time you make it to sub-basement 17, there are only a few minutes until midnight. "We have a big problem," she says; "there must be almost fifty bugs in this system, but nothing else can print The List. Stand in this square, quick! There's no time to explain; if you can convince them to pay you in stars, you'll be able to--" She pulls a lever and the world goes blurry.

When your eyes can focus again, everything seems a lot more pixelated than before. She must have sent you inside the computer! You check the system clock: 25 milliseconds until midnight. With that much time, you should be able to collect all fifty stars by December 25th.

Collect stars by solving puzzles. Two puzzles will be made available on each day millisecond in the advent calendar; the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!

You're standing in a room with "digitization quarantine" written in LEDs along one wall. The only door is locked, but it includes a small interface. "Restricted Area - Strictly No Digitized Users Allowed."

It goes on to explain that you may only leave by solving a captcha to prove you're not a human. Apparently, you only get one millisecond to solve the captcha: too fast for a normal human, but it feels like hours to you.

The captcha requires you to review a sequence of digits (your puzzle input) and find the sum of all digits that match the next digit in the list. The list is circular, so the digit after the last digit is the first digit in the list.

For example:

1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
1111 produces 4 because each digit (all 1) matches the next.
1234 produces 0 because no digit matches the next.
91212129 produces 9 because the only digit that matches the next one is the last digit, 9.

What is the solution to your captcha?
 */
class ReverseCaptchaPart1 {

    companion object {
        fun reverseCaptcha(value: String): Int = (0 until (value.length))
                .filter { value[it] == value[if (it == value.length - 1) 0 else (it + 1)] }
                .sumBy { value[it].toInt() - 48 }
    }

    fun main(args: Array<String>) {

        val input = "64971395968289825957777798234951578482268493996619135916436993343536643184775448866196536355798516621" +
                "935871473931837138238829615119536157121613192515849244146184468732492331538135833157157761378964916648615" +
                "223794591798797779389173986514973475599324136188633692653848227112475535957279145133584253489319269355865" +
                "999117198384928548913942142593363861488441589693891499273249219245863648452322824453233158758477955278854" +
                "466725357732464991527411592461175834567618344398299273396637349838568596576892924147798372792127982672797" +
                "687255631542843479916175973493265982993456233938532811965682348395485642736589262772816352472146793844994" +
                "335819263226235485459363583155935224744397594514416318356372356289135785936796412628944598213552353592311" +
                "358931641762348363163756929194178299221388951371452534246856334938527188422168554999653433376573124389566" +
                "262482992498297168544382536682792358943525451421148964948237487643454968278545969888552167325893941325515" +
                "819652569623645791144759994744966554255425148684738882357693716723747655678213322727932452683494653444471" +
                "816152412928591947795993768472888259277994173418614413888399432274248485392538351865168714724694342131128" +
                "732486766369843254661958363897663773334525183486998574638537161774349862711144193354635693467163954534251" +
                "539253657474479573224361711357464128423192848931268361715453664821924499649174571865815164824679182646697" +
                "365476528426392888413786364762323734588246914293314263758364425842741697259524173725444971853172417653864" +
                "836925379668893124519138295696154477585687228131774382855262984355184492791314751837736226655433438672131" +
                "324422323339645329122493249927796152578575586385248714194662666383519528676294717238418666743951636721939" +
                "182377433869215192647271737323561291184877338777124414496914948247751943782286342266215746196844428197235" +
                "314969551549499253792749211138819383755384467171929148244233776132127233398292428932343727722456514992841" +
                "625543584132775613911811974452899326915717441426438757333111632398261486295226459761188599928599551635751" +
                "964869559429965738761479334162631886651914457457181653535114939473591697544842561817157291719516559432355" +
                "2199346814729617189679698944337146"

        println("Solution is ${reverseCaptcha(input)}")
    }
}