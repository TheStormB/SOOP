import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WeeklyData {

    private static final String NAME = "/home/kaan/Documents/Codes/Java/Lab_9/ecdc_covid19_cases.csv";
    FileInputStream file = new FileInputStream(new File(NAME));
    //Workbook workbook = new XSSFWorkbook(file);
    //DataFormatter dataFormatter = new DataFormatter(file);


    //regex (\d{2}\/\d{2}\/\d{4}),(\d{4}\-\d{2}),(\d{4}),(\d{2}),([A-Z]\w+),([A-Z]{2}),([A-Z]{3}),(\d{8}),([A-Z]\w+),(\d{1}\.\d{2})


    private Integer year;
    private Integer week;
    private Integer cases;
    private Integer deaths;
    private String country;
    private String  continent;
    private Double rate;


    /*
    Proper lines are shown in the above example. The exception should be thrown if a line has not
a proper format. The exception must contain the cause of the error the incorrect data.
     */
    public WeeklyData(String line) throws Exception{
        Pattern pattern = Pattern.compile("(\\d{2}\\/\\d{2}\\/\\d{4}),(\\d{4}\\-\\d{2}),(\\d{4}),(\\d{2}),([A-Z]\\w+),([A-Z]{2}),([A-Z]{3}),(\\d{8}),([A-Z]\\w+),(\\d{1}\\.\\d{2})"
        ,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        boolean matchFound = matcher.find();
        if (matchFound){

        }else{
            throw new IllegalArgumentException();
        }

    }

    public Integer getYear() {
        return year;
    }
    public Integer getWeek() {
        return week;
    }
    public Integer getCases() {
        return cases;
    }
    public Integer getDeaths() {
        return deaths;
    }
    public String getCountry() {
        return country;
    }
    public String getContinent() {
        return continent;
    }
    public Double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public class FileFormatException extends Exception {
        private static final long serialVersionUID = 1L;
        protected int lineNumber;
        protected String info;  // error desc. and not proper data
        protected String fileName;
        public FileFormatException(String fileName, int lineNo, String
        info) {
        // insert your code here
        // accept all parameters without checking
        }
        public int getLineNo( ) {
        return lineNumber;
        }
        public String getInfo() {
        return info;
        }
        public String getFileName() {
        return fileName;
        }
    }

    public class CovidData {
        protected ArrayList<WeeklyData> allWeeks= new
        ArrayList<WeeklyData>();
        public void readFromFile(String fileName) throws FileFormatException {
        // insert your code here
        // the lines with errors should be rejected and suitable
        //message should appear on standard error
        }
        // for all countries and all weeks
        public int getTotalCases() {
        // enter your code here
        return 0;
        }
        // total number of cases for all countries in a continent all
       // weeks
        public int getTotalCases(String continent) {
        // enter your code here
        return 0;
    }

    // total number of cases for all countries in a continent in
    // total number of cases for all countries in the week
    public int getTotalCases(int week) {
    // enter your code here
        return 0;
    }
    //the week
    public int getTotalCases(String continent, int week) {
        // enter your code here
        return 0;
    }
    // total number of deaths for all countries and all weeks
    public int getTotalDeaths() {
        // enter your code here
        return 0;
    }
    // total number of deaths for all countries in a continent all
    //weeks
    public int getTotalDeaths(String continent) {
        // enter your code here
        return 0;
    }
    // total number of deaths for all countries in the week
    public int getTotalDeaths (int week) {
        // enter your code here
        return 0;
    }

    // total number of deaths for all countries in a continent in
    //the week
    public int getTotalDeaths(String continent, int week) {
        // enter your code here
        return 0;
        }
    }
}
