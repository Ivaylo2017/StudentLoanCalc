package androidhw1;
//import javafx.scene.paint.Color;
import java.awt.Color;
import javax.swing.*;

public class AndroidHw1 extends JFrame  {

    public AndroidHw1 () {
        //Variable Declarations
        JLabel      contactInfo, demographic,fullName, address1,address2,city, state,
                    zip, country, phone, phtype, dob, email, verify, academic, 
                    gender, ethnicity, citizenship, enteringAsA, entryTerm,
                    primaryMajor, secondaryMajor, interestedIn, schoolInfo, highSchool,
                    schoolCity, schoolState, schoolGrad, satScore, actScore, ged,
                    loginInfo, username, password, confirm;
        
        JTextField  firstN, mi, lastN,a1, a2,ct,zp,ph1,ph2,ph3,eAddr,verEAddr;
        
        JComboBox   province, month, day, year, cntry, eth, ctryCit,entering,enTerm,primMaj,
                secondMaj;
        
        JRadioButton cell, home, work, male, female;
        
        JCheckBox   athletics, cope, counseling, financialAid, childrenCenter, scholarships,
                seek,government, development, support, wellness;
        
        String[] provinces = {"Select One", "New York", "Alabama", "Alaska", "Arizona",
            "Arkansas", "California", "Colorado"
                };
        String[] months = {"Month","January","February", "March", "April","May",
            "June", "July", "August", "September", "October", "November", "December"
                };
        String[] days = {"Day","1","2","3","4"};
        String[] years = {"Year", "1960s", "1970s", "1980s","1990s","2000s"};
        String[] countries = {"USA", "Argentina","China", "Saudi Arabia", "Mexico", "Canada",
            "Bulgaria", "Greece", "France", "Italy", "Germany", "Netherlands", "Sweden",
            "Columbia", "Chile", "Brazil", "South Africa", "Ukraine", "Egypt", "Thailand"
                };
        String[] ethnicities = {"Select One", "Asian or Pacific Islandee", "Black - Non-hispanic",
            "Hispanic/Latino", "White - Non-hispanic", "Other"
                };
        String[] citizenships = {"Select One", "USA", "Afghanistan", "Albania", "Algeria", "American Samoa",
            "Andorra", "Angola", "Anguilla", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria",
            "Azerbaijan", "Bahamas", "Bahrein", "Bangladesh","Barbados", "Belorus/Belorussia", "Belgium", "Belize",
            "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "British India "
                + "Ocean Territories", "British West Indies", "Brunei Darussalam", "Bulgaria","Burkina Faso","Burma",
                "Burundi", "Cambodia"
                };
        String[] enterAs = {"Select One", "Freshman", "Transfer"};
        String[] entryTerms = {"Select One", "Spring 2016", "Fall 2016", "Sprng 2017",
            "Fall 2017", "Spring 2018", "Fall 2018"
                };
        String[] majors = {"Select One", "Accounting", "Applied Mathematics Finance", "Applied Mathematics Infromation Systems",
            "Architecture Technology - Associate Degree", "Architecture Technology - Bachelors Degree"
                };
        String[] secondaryMajors = {"Select One", "Civil Engineering", "Communication Design", "Computer Science", "Dental Hygene",
            "Entertainment Technology", "Fashion Marketing"
                };
        
        //Create Frame
        JFrame frame = new JFrame("Welcome Page");
        frame.setSize(800,1485);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create Panel and set Layout to null for Custom made
        JPanel mypanel = new JPanel();
        mypanel.setLayout(null);
        frame.add(mypanel);
        
        //Create Components until line 241
        contactInfo = new JLabel("Contact Information");
        contactInfo.setBounds(10,15,740,20);
        contactInfo.setBackground(Color.BLUE);
        contactInfo.setOpaque(true);
        
        fullName = new JLabel("Full Name");
        fullName.setBounds(10,45,250,20);
        firstN = new JTextField();
        firstN.setBounds(260,45,100,20);
        mi = new JTextField();
        mi.setBounds(365,45,20,20);
        lastN = new JTextField();
        lastN.setBounds(390,45,100,20);
        
        address1 = new JLabel("Address 1 *");
        address1.setBounds(10,70,250,20);
        a1 = new JTextField();
        a1.setBounds(260,70,200,20);
        address2 = new JLabel("Address 2");
        address2.setBounds(10,95,250,20);
        a2 = new JTextField();
        a2.setBounds(260,95,200,20);
        
        city = new JLabel("City*");
        city.setBounds(10,120,200,20);
        ct = new JTextField();
        ct.setBounds(260,120,200,20);
        
        state = new JLabel("State/Provice*");
        state.setBounds(10,145,200,20);
        province = new JComboBox(provinces);
        province.setBounds(260,145,150,20);
        
        zip = new JLabel("Zip code*");
        zip.setBounds(10,170,200,20);
        zp = new JTextField();
        zp.setBounds(260,170,40,20);
        
        country = new JLabel("Country *");
        country.setBounds(10,195,200,20);
        cntry = new JComboBox(countries);
        cntry.setBounds(260,195,200,20);
        
        phone = new JLabel("Primary Phone*");
        phone.setBounds(10,220,200,20);
        ph1 = new JTextField();
        ph1.setBounds(260,220,30,20);
        ph2 = new JTextField();
        ph2.setBounds(295,220,40,20);
        ph3 = new JTextField();
        ph3.setBounds(340,220,40,20);
        
        phtype = new JLabel("Phone Type*");
        phtype.setBounds(10,245,200,20);
        cell = new JRadioButton("Cell");
        cell.setBounds(270,245,70,20);
        home = new JRadioButton("Home");
        home.setBounds(350,245,70,20);
        work = new JRadioButton("Work");
        work.setBounds(430,245,70,20);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(cell);
        group1.add(home);
        group1.add(work);
       
        dob = new JLabel("Date of Birth *");
        dob.setBounds(10,270,200,20);
        month = new JComboBox(months);
        month.setBounds(260,270,80,20);
        day = new JComboBox(days);
        day.setBounds(345,270,50,20);
        year = new JComboBox(years);
        year.setBounds(400,270,65,20);
        
        email = new JLabel("Email Address *");
        email.setBounds(10,295,200,20);
        eAddr = new JTextField();
        eAddr.setBounds(260,295,200,20);
        verify = new JLabel("Verify Email Address *");
        verify.setBounds(10,320,200,20);
        verEAddr = new JTextField();
        verEAddr.setBounds(260,320,200,20);
        
        demographic = new JLabel("Demographic Information");
        demographic.setBounds(10,345,740,20);
        demographic.setBackground(Color.BLUE);
        demographic.setOpaque(true);
        
        gender = new JLabel("Gender");
        gender.setBounds(10,375,200,20);
        male = new JRadioButton("Male");
        male.setBounds(270,375,70,20);
        female = new JRadioButton("Female");
        female.setBounds(350,375,70,20);
        
        ButtonGroup group2 = new ButtonGroup();
        group2.add(male);
        group2.add(female);
        
        ethnicity = new JLabel("Ethnicity");
        ethnicity.setBounds(10,400,200, 20);
        eth = new JComboBox(ethnicities);
        eth.setBounds(260,400,200,20);
        
        citizenship = new JLabel("Country of Citizenship");
        citizenship.setBounds(10,425,200,20);
        ctryCit = new JComboBox(citizenships);
        ctryCit.setBounds(260,425,200,20);
        
        academic = new JLabel("Academic Information");
        academic.setBounds(10,450,740,20);
        academic.setBackground(Color.BLUE);
        academic.setOpaque(true);
        
        enteringAsA = new JLabel("I will be entering college as *");
        enteringAsA.setBounds(10,480,200,20);
        entering = new JComboBox(enterAs);
        entering.setBounds(260,480,150,20);
        
        entryTerm = new JLabel("Entry Term *");
        entryTerm.setBounds(10,505,200,20);
        enTerm = new JComboBox(entryTerms);
        enTerm.setBounds(260,505,100,20);
        
        primaryMajor = new JLabel("Primary Major *");
        primaryMajor.setBounds(10,530,200,20);
        primMaj = new JComboBox(majors);
        primMaj.setBounds(260,530,200,20);
        
        secondaryMajor = new JLabel("Secondary Major *");
        secondaryMajor.setBounds(10,555,200,20);
        secondMaj = new JComboBox(secondaryMajors);
        secondMaj.setBounds(260,555,200,20);
        
        interestedIn = new JLabel("I am interested in learning more about...");
        interestedIn.setBounds(10,580,200,15);
        athletics = new JCheckBox("Athletics, Intrumarals and Recreation");
        athletics.setBounds(15,600,250,15);
        cope = new JCheckBox("COPE");
        cope.setBounds(15,620,250,15);
        counseling = new JCheckBox("Counseling");
        counseling.setBounds(15,640,250,15);
        financialAid = new JCheckBox("Financial Aid");
        financialAid.setBounds(15,660,250,15);
        childrenCenter = new JCheckBox("Our Children Center");
        childrenCenter.setBounds(15,680,250,15);
        scholarships = new JCheckBox("Scholarships");
        scholarships.setBounds(15,700,250,15);
        seek = new JCheckBox("SEEK Program");
        seek.setBounds(285,600,250,15);
        government = new JCheckBox("Student Government");
        government.setBounds(285,620,250,15);
        development = new JCheckBox("Student Life and Development");
        development.setBounds(285,640,250,15);
        support = new JCheckBox("Student Support Services(Disabilities)");
        support.setBounds(285,660,250,15);
        wellness = new JCheckBox("Student Wellness Center");
        wellness.setBounds(285,680,250,15);
        
        highSchool = new JLabel("High School Information");
        highSchool.setBounds(10,710,740,20);
        highSchool.setBackground(Color.BLUE);
        highSchool.setOpaque(true);
        
        loginInfo = new JLabel("Login Information");
        loginInfo.setBounds(10,1285,740,20);
        loginInfo.setBackground(Color.BLUE);
        loginInfo.setOpaque(true);
        
        //Add Components to Panel
        mypanel.add(contactInfo);
        mypanel.add(highSchool);
        mypanel.add(loginInfo);
        mypanel.add(fullName);
        mypanel.add(firstN);
        mypanel.add(mi);
        mypanel.add(lastN);
        mypanel.add(address1);
        mypanel.add(a1);
        mypanel.add(address2);
        mypanel.add(a2);
        mypanel.add(city);
        mypanel.add(ct);
        mypanel.add(state);
        mypanel.add(province);
        mypanel.add(zip);
        mypanel.add(zp);
        mypanel.add(country);
        mypanel.add(cntry);
        mypanel.add(phone);
        mypanel.add(ph1);
        mypanel.add(ph2);
        mypanel.add(ph3);
        mypanel.add(phtype);
        mypanel.add(cell);
        mypanel.add(home);
        mypanel.add(work);
        mypanel.add(dob);
        mypanel.add(month);
        mypanel.add(day);
        mypanel.add(year);
        mypanel.add(email);
        mypanel.add(eAddr);
        mypanel.add(verify);
        mypanel.add(verEAddr);
        
        mypanel.add(demographic);
        mypanel.add(gender);
        mypanel.add(male);
        mypanel.add(female);
        mypanel.add(ethnicity);
        mypanel.add(eth);
        mypanel.add(country);
        mypanel.add(citizenship);
        mypanel.add(ctryCit);
        
        mypanel.add(academic);
        mypanel.add(enteringAsA);
        mypanel.add(entering);
        mypanel.add(entryTerm);
        mypanel.add(enTerm);
        mypanel.add(primaryMajor);
        mypanel.add(primMaj);
        mypanel.add(secondaryMajor);
        mypanel.add(secondMaj);
        mypanel.add(interestedIn);
        mypanel.add(athletics);
        mypanel.add(cope);
        mypanel.add(counseling);
        mypanel.add(financialAid);
        mypanel.add(childrenCenter);
        mypanel.add(scholarships);
        mypanel.add(seek);
        mypanel.add(government);
        mypanel.add(development);
        mypanel.add(support);
        mypanel.add(wellness);
        
        //Create Scroll Bars and add them to the frame
        JScrollPane scroll = new JScrollPane(mypanel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scroll);
        
        //Draw frame
        frame.setVisible(true);
    } 
    
    //Call the New Class in the main 
    public static void main(String[] args) {
        new AndroidHw1();
    }
}