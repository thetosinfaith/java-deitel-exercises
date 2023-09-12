package CliqueShoppa;

import java.util.Scanner;

public class ProductListIterator {
    public static void main(String[] args) {

        System.out.println("Brand Festival Deals\n");

        System.out.println("Official Store\n");

        String product1 = "Tools Box Kit Set With 12V CORDLESS Drill 10MM Machine";

        String product2 = "Malta Guinness Can 330ml x24";

        String product3 = "VEET GOLD Vitamin C Extra Whitening Super Scrub";

        String product4 = "Knorr Chicken Seasoning Cubes 8g x 45";

        String product5 = "Knorr Chicken Seasoning Cubes 8g x 45";

        String product6 = "NIVEA Nourishing Cocoa Body Lotion For Women - 400ml (Pack Of 2)";

        String product7 = "Oraimo 20000mAh Power-Bank OPB-P208DN";

        String product8 = "NIVEA Watimagbo Pack- Perfect & Radiant Body Lotion - 400ml (Pack of 3)";

        String product9 = "Ace Elec Power Banks 20000 MAh Utra Slim Portable Fast Charger (ACE ELEC)";

        String product10 = "Oraimo 27000mAh Power-Bank OPB-P271D";

        String product11 = "Silver Crest 2 Litres German Industrial Blender With 1 Litre Mill Jar";

        String product12 = "Hisense 20-Litre Microwave MOWH";

        String product13 = "Oraimo 10000mAh Power-Bank OPB-P118D";

        String product14 = "Indomie Regular Chicken Flavour 70G X 40";

        String product15 = " NIVEA Deep Anti-Perspirant Spray For Men 48h - 200ml (Pack Of 2)";

        String product16 = "Oraimo 27000mAh Massive Power Charging Bank Traveller 3 Byte";

        String product17 = "Ace Elec F9 Wireless Fingerprint Touch Bluetooth Headset";

        String product18 = "Knorr Beef Seasoning Cubes 8g x45 (Knorr)";

        String product19 = "Power Banks 20000 MAh Utra Slim Portable Fast Charger (ACE ELEC) - 2";

        String product20 = "Six Pieces-in-1 Quality Ankle Socks";

        String product21 = "Ace Elec Power Banks 10000 MAh Utra Slim Portable Fast Charger";

        String product22 = "DCQ D2 Power Banks 20000 MAh Utra Slim Portable Fast Charger";

        String product23 = "VOULAO TWS Wireless Earbuds Bluetooth Earphone With Mic Headset";

        String product24 = "XIAOMI Redmi A2+ 6.52 2GB RAM/32GB ROM Android 12 - Black";

        String product25 = "NIVEA Pearl & Beauty Anti-Perspirant Spray For Women, 48h - 200ml (Pack Of 2) ";

        String product26 = "Kiki New Gain LED Display Cordless Rechargeable Clipper (NG-888B)";

        String product27 = "VEJARO T09 Men's 2 In 1 Short Sleeve T-Shirt & Shorts Set-Black";

        String product28 = "Mtng 4G LTE MiFi - M30S + Free 30GB Data Bonus On Activation.";

        String product29 = "itel 20000mAh Dual Output Fast Charging Power Bank";

        String product30 = "Mens Comfortable Loafers Soft Leather Slip On Shoes-Black";

        String product31 = "Ace Elec Power Banks 20000 MAh Utra Slim Portable Fast Charger";

        String product32 = "DCQ D1 Power Banks 10000 MAh Utra Slim Portable Fast Charger";

        String productt33 = "Ace Elec M10 Wireless Bluetooth 5.1 Earphones Dual LED Display";

        String product34 = "Cerave Acne Control Cleanser With 2% Salicylic Acid 237ml";

        String product35 = "Luxury Black Full Metal Digital Lava Wrist Watch- Unisex";

        String product36 = "Winwolf Wireless Fingerprint Touch Bluetooth Earphone With Power Display";

        String product37 = "2 In 1 Men's Short Sleeve Shirt & Short Set - White";

        String product38 = "Winwolf Wireless Fingerprint Touch Bluetooth Headset Earphone With Power Display";

        String product39 = "Trendy Classic Lace-up White Sneakers Shoes For Men/ Women";

        String product40 = "2022 Men's Casual Classic Running Sneakers- Multi";

        String product41 = "2022 Men Casual Classic Running Sneakers - White";

        String product42 = "Wireless Mouse Charging Mute Light 2.4G Mouse";

        String product43 = "Bluetooth Dual-mode Led Gaming Rechargeable Wireless Mouse";

        String product44 = "Bluetooth Wireless Mouse Silent Office Rechargeable Mouse";

        String product45 = "Lenovo Ideapad 3 Intel Core I3 15\" 4GB RAM/ 1TB - FreeDOS";

        String product46 = "Bluetooth Ultra Thin Wireless Mouse 2.4G Charging Black";

        String product47 = "Seagate BackUp Plus Slim 500GB Portable Storage Drive";

        String product48 = "Pen Flash Drive 3.0 64GB - Metal OTG Micro USB Type-C";

        String product49 = "Portable Mini Printer Student Study Labels Thermal Printer";

        String product50 = "UWY 32G Highly Compatible With TV Metal Flash Drive For PC";

        String product51 = "Hp Stream 11 Intel Celeron - 64GB SSD 4GB RAM Windows 10+ USB Light For Keyboard";

        String product52 = "Mini Bluetooth 5.1 Dongle Wireless Transfer Adapter For PC";

        String product53 = "USB 3.0 To Type-C + Micro Adapter";

        String product54 = "MTN 4G Wireless Router MF293N + Free 50GB Data On Activation";

        String product55 = "V8 External Live Sound Card Microphone Set With 12 Sound";

        String product56 = "Eaget Pen Flash Drive 3.0 64GB - Metal OTG Micro USB Type-C";

        String product57 = "HDMI (HDTV) To VGA Adapter Analog Cable";

        String product58 = "Wireless Bluetooth Keyboard For Phone And Tablet-VSC";

        String product59 = "UWY 128G Pen USB Flash Drive Metal And TV Profession Flash Disk";

        String product60 = "High Speed Universal USB 4 Port Hub With Cable Socket Pattern Splitter Cable Adapter For Laptop";

int productList;

        Scanner input = new Scanner(System.in);

        System.out.println("NEW TO CLIQUESHOPPA?");
        System.out.println("Subscribe to our newsletter to get updates on our latest offers!");
        System.out.print("Enter E-mail Address: ");

        int userInput = input.nextInt();

    }

}




//Initialize Loop Counter: To iterate through the list of products, you'll need a loop counter variable. Initialize it to 1 since you'll start with the first product.

/*

Start a Loop: Use a loop (either a for or while loop) that continues as long as there are more products to display. You can determine this by checking if the current product number is less than or equal to the total number of products.

Display the Product: Inside the loop, print the name of the product corresponding to the current product number. You can use the loop counter to access the variables representing the product names.

Increment the Loop Counter: After displaying the product, increment the loop counter to move on to the next product.

Repeat Until All Products are Displayed: The loop will continue to run until you've displayed all the products.

End the Program: Once the loop has displayed all the products, the progOram can naturally exit.

Remember to replace the placeholder variables with actual product names and adjust the loop conditions accordingly. This thought process should help you create the Java program to display the list of products without writing the actual code.




.

    */