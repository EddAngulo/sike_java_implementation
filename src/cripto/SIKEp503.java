/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import ecoperations.ECPoint;
import fieldoperations.Fp2Element;
import java.math.BigInteger;

/**
 *
 * @author eduar
 */
public class SIKEp503 extends Parameters {
    
    public SIKEp503() {
        p = new BigInteger("004066F541811E1E6045C6BDDA77A4D01B9BF6C87B7E7DAF13085BDA2211E7A0ABFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 16);
        e2 = 0xFA;
        e3 = 0x9F;
        super.init();

        BigInteger x0, x1, y0, y1;

        x0 = new BigInteger("00325CF6A8E2C6183A8B9932198039A7F965BA8587B67925D08D809DBF9A69DE1B621F7F134FA2DAB82FF5A2615F92CC71419FFFAAF86A290D604AB167616461", 16);
        x1 = new BigInteger("003E7B0494C8E60A8B72308AE09ED34845B34EA0911E356B77A11872CF7FEEFF745D98D0624097BC1AD7CD2ADF7FFC2C1AA5BA3C6684B964FA555A0715E57DB1", 16);
        Fp2Element xQ2 = new Fp2Element(x0, x1);
        y0 = new BigInteger("003A34654000BD4CB2612017BD5A1965A9F89FE11C55D517DF91B89B94F4F9C58B9A9DD056915573FEDC09CCD4997E82378759E00A2DE225CE04589D201FD754", 16);
        y1 = new BigInteger("0019DEF0E8930E5123A22E346B1FFBD35EB01451647D8708A4835473B2539BD26806ED105A29F2D3F7EAA262426A965338782C5D20FBF478E4D1C8DBFC5B8294", 16);
        Fp2Element yQ2 = new Fp2Element(y0, y1);
        Q2 = new ECPoint(xQ2, yQ2);

        //System.out.println( curve.xDBLe(Q2, e2));
        x0 = new BigInteger("0002ED31A03825FA14BC1D92C503C061D843223E611A92D7C5FBEC0F2C915EE7EEE73374DF6A1161EA00CDCB786155E21FD38220C3772CE670BC68274B851678", 16);
        x1 = new BigInteger("001EE4E4E9448FBBAB4B5BAEF280A99B7BF86A1CE05D55BD603C3BA9D7C08FD8DE7968B49A78851FFBC6D0A17CB2FA1B57F3BABEF87720DD9A489B5581F915D2", 16);
        Fp2Element xP2 = new Fp2Element(x0, x1);
        y0 = new BigInteger("00244D5F814B6253688138E317F24975E596B09BB15C6418E5295AAF73BA7F96EFED145DFAE1B21A8B7B121FEFA1B6E8B52F00478218589E604B97359B8A6E0F", 16);
        y1 = new BigInteger("00181CCC9F0CBE1390CC14149E8DE88EE79992DA32230DEDB25F04FADE07F242A9057366060CB59927DB6DC8B20E6B15747156E3C5300545E9674487AB393CA7", 16);
        Fp2Element yP2 = new Fp2Element(y0, y1);
        P2 = new ECPoint(xP2, yP2);

        //System.out.println(curve.xDBLe(P2, e2));
        x0 = new BigInteger("003D24CF1F347F1DA54C1696442E6AFC192CEE5E320905E0EAB3C9D3FB595CA26C154F39427A0416A9F36337354CF1E6E5AEDD73DF80C710026D49550AC8CE9F", 16);
        x1 = new BigInteger("0006869EA28E4CEE05DCEE8B08ACD59775D03DAA0DC8B094C85156C212C23C72CB2AB2D2D90D46375AA6D66E58E44F8F219431D3006FDED7993F51649C029498", 16);
        xR2 = new Fp2Element(x0, x1);

        x0 = new BigInteger("0039014A74763076675D24CF3FA28318DAC75BCB04E54ADDC6494693F72EBB7DA7DC6A3BBCD188DAD5BECE9D6BB4ABDD05DB38C5FBE52D985DCAF74422C24D53", 16);
        x1 = new BigInteger("00000000", 16);
        Fp2Element xQ3 = new Fp2Element(x0, x1);
        y0 = new BigInteger("00000000", 16);
        y1 = new BigInteger("0025512012C90A6869C4B29B9A757A03006BC7DF0BF7A2526A0713939FA48018AE3E249BD63699BEB3B8DEA215B7AE1B5A30FE371B64C5F1B0BF051A11D68E04", 16);
        Fp2Element yQ3 = new Fp2Element(y0, y1);
        Q3 = new ECPoint(xQ3, yQ3);

        //System.out.println(curve.xTPLe(Q3, e3));
        x0 = new BigInteger("0032D03FD1E99ED0CB05C0707AF74617CBEA5AC6B75905B4B54B1B0C2D73697840155E7B1005EFB02B5D02797A8B66A5D258C76A3C9EF745CECE11E9A178BADF", 16);
        x1 = new BigInteger("00000000", 16);
        Fp2Element xP3 = new Fp2Element(x0, x1);
        y0 = new BigInteger("002D810F828E3DC024D1BBBC7D6FA6E302CC5D458571763B7CCD0E4DBC9FA1163F0C1F8F4AE32A57F89DF8D2586D2A06E9FA30442B94A725266358C45236ADF3", 16);
        y1 = new BigInteger("00000000", 16);
        Fp2Element yP3 = new Fp2Element(y0, y1);
        P3 = new ECPoint(xP3, yP3);

        //System.out.println(curve.xTPLe(P3, e3));
        x0 = new BigInteger("0000C1465FD048FFB8BF2158ED57F0CFFF0C4D5A4397C7542D722567700FDBB8B2825CAB4B725764F5F528294B7F95C17D560E25660AD3D07AB011D95B2CB522", 16);
        x1 = new BigInteger("00288165466888BE1E78DB339034E2B8C7BDF0483BFA7AB943DFA05B2D1712317916690F5E713740E7C7D4838296E67357DC34E3460A95C330D5169721981758", 16);
        xR3 = new Fp2Element(x0, x1);
    }

    @Override
    public int getN3() {
        BigInteger d = new BigInteger("3");
        return d.pow(e3).bitLength();
    }

    @Override
    public int getN2() {
        return (int)(Math.ceil(e2/8));
    }
    
}
