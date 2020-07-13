public class Question1 {

    public String reformatDate(String date) {
            String day = null;
            String month = null;
            String monthNum = null;
            String year = null;
            if ( date.charAt(1) == 't' || date.charAt(1) == 'c' || date.charAt(1) == 'r'|| date.charAt(1) == 's' || date.charAt(1) == 'n'){
                day = "0" + date.substring(0,1);
                month = date.substring (4,7);
                year = date.substring(8, date.length());

            }
            else {
                day = date.substring(0,2);
                month = date.substring (5,8);
                year = date.substring(9, date.length());
            }

            switch (month) {
                case "Jan": {
                    monthNum = "01";
                    break;
                }
                case "Feb": {
                    monthNum = "02";
                    break;
                }
                case "Mar":{
                    monthNum = "03";
                    break;
                }
                case "Apr": {
                    monthNum = "04";
                    break;
                }
                case "May":{
                    monthNum = "05";
                    break;
                }
                case "Jun":{
                    monthNum = "06";
                    break;
                }
                case "Jul":{
                    monthNum = "07";
                    break;
                }
                case "Aug":{
                    monthNum = "08";
                    break;
                }
                case "Sep":{
                    monthNum = "09";
                    break;
                }
                case "Oct":{
                    monthNum = "10";
                    break;
                }
                case "Nov":{
                    monthNum = "11";
                    break;
                }
                case "Dec":{
                    monthNum = "12";
                    break;
                }
            }


            return year + "-" + monthNum + "-" + day;




        }
    }
