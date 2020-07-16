/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family;

/**
 *
 * @author petros
 */
public class Pet {

    private String nickname;
    private String type;

    public Pet(String nickname, String type) {
        this.nickname = nickname;
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" + "nickname=" + nickname + ", type=" + type + '}';
    }

}
