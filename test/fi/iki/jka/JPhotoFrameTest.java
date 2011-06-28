package fi.iki.jka;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 28/06/2011
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
public class JPhotoFrameTest {

    private JPhotoFrame jphotoFrame;

    @Before
    public void instantiateJPhotoFrame() throws Exception
    {
        setJphotoFrame(new JPhotoFrame("Test Frame Name",new String[] {"/resources/pics/directory.png"}));

    }


    @Test
    public void testActionPerformed() throws Exception {

        getJphotoFrame().actionPerformed(null);

    }

    public JPhotoFrame getJphotoFrame() {
        return jphotoFrame;
    }

    public void setJphotoFrame(JPhotoFrame jphotoFrame) {
        this.jphotoFrame = jphotoFrame;
    }
}
