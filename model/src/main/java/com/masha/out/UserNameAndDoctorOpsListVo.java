package com.gangan.out;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: NameAndDoctorOpsList <br/>
 * Description: <br/>
 * date: 2019/11/9 10:02<br/>
 *
 * @author Administrator<br />
 * @since JDK 1.8
 */
public class UserNameAndDoctorOpsListVo implements Serializable {

    private List<Ops> userNameOps;
    private List<Ops> docNameOps;

    public List<Ops> getUserNameOps() {
        return userNameOps;
    }

    public void setUserNameOps(List<Ops> userNameOps) {
        this.userNameOps = userNameOps;
    }

    public List<Ops> getDocNameOps() {
        return docNameOps;
    }

    public void setDocNameOps(List<Ops> docNameOps) {
        this.docNameOps = docNameOps;
    }
}
