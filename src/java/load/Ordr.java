
package load;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sandeep
 */
public class Ordr {

private String bname;
private String bemail;
private String bnumber;
private String baddress;

    /**
     * @return the bname
     */
    public String getBname() {
        return bname;
    }

    /**
     * @param bname the bname to set
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    /**
     * @return the bemail
     */
    public String getBemail() {
        return bemail;
    }

    /**
     * @param bemail the bemail to set
     */
    public void setBemail(String bemail) {
        this.bemail = bemail;
    }

    /**
     * @return the bnumber
     */
    public String getBnumber() {
        return bnumber;
    }

    /**
     * @param bnumber the bnumber to set
     */
    public void setBnumber(String bnumber) {
        this.bnumber = bnumber;
    }

    /**
     * @return the baddress
     */
    public String getbaddress() {
        return baddress;
    }

    /**
     * @param baddress the baddress to set
     */
    public void setbaddress(String baddress) {
        this.baddress = baddress;
    }

    
    
     public int store() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
         
        String url="jdbc:derby://localhost:1527/niit;create=true;user=javed;password=1234";
        Connection con=DriverManager.getConnection(url);

        PreparedStatement ps = con.prepareStatement("insert into ordr(bname,bemail,bcontact,baddress)values (?,?,?,?)");
           
        ps.setString(1, getBname());
        ps.setString(2, getBemail());
        ps.setString(3, getBnumber());
        ps.setString(4, getbaddress());
    
        int a=ps.executeUpdate();
        
        if(a==1) {
            return a;
        }else {
            return a;
        }
    }

    
}