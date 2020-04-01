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
public class SIKEp751 extends Parameters {

    public SIKEp751() {
        p = new BigInteger("00006FE5D541F71C0E12909F97BADC668562B5045CB25748084E9867D6EBE876DA959B1A13F7CC76E3EC968549F878A8EEAFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 16);
        e2 = 0x174;
        e3 = 0xEF;
        super.init();

        BigInteger x0, x1, y0, y1;

        x0 = new BigInteger("00001723D2BFA01A78BF4E39E3A333F8A7E0B415A17F208D3419E7591D59D8ABDB7EE6D2B2DFCB21AC29A40F837983C0F057FD041AD93237704F1597D87F074F682961A38B5489D1019924F8A0EF5E4F1B2E64A7BA536E219F5090F76276290E", 16);
        x1 = new BigInteger("00002569D7EAFB6C60B244EF49E05B5E23F73C4F44169A7E02405E90CEB680CB0756054AC0E3DCE95E2950334262CC973235C2F87D89500BCD465B078BD0DEBDF322A2F86AEDFDCFEE65C09377EFBA0C5384DD837BEDB710209FBC8DDB8C35C7", 16);
        Fp2Element xQ2 = new Fp2Element(x0, x1);
        y0 = new BigInteger("000035B82D1BD2BA608B42794C4820C56A3D8BBAD28380B8D85A1910E2609A61F7BC0BCA8ED8EF883E7E98C744A0AC85D2893738521B62EB23D1983D2EDCF2AB437108DC048AA853FF9BC791224B121E8FDF1EA5F617E6ED5898663DDED49154", 16);
        y1 = new BigInteger("00000F22306A6963907F16AA38F89C672A4054DB5FD1D26598A3140EA204B10094AE64093142AEB056942494D216A74ED9F51FFC9272D1772151013334EC570B532DB0C083CF39867F63D191029033F942E977B85F69EC738B4C26D3B72E2821", 16);
        Fp2Element yQ2 = new Fp2Element(y0, y1);
        Q2 = new ECPoint(xQ2, yQ2);

        //System.out.println(curve.xDBLe(Q2, e2));
        x0 = new BigInteger("00004514F8CC94B140F24874F8B87281FA6004CA5B3637C68AC0C0BDB29838051F385FBBCC300BBB24BFBBF6710D7DC8B29ACB81E429BD1BD5629AD0ECAD7C90622F6BB801D0337EE6BC78A7F12FDCB09DECFAE8BFD643C89C3BAC1D87F8B6FA", 16);
        x1 = new BigInteger("0000158ABF500B5914B3A96CED5FDB37D6DD925F2D6E4F7FEA3CC16E1085754077737EA6F8CC74938D971DA289DCF2435BCAC1897D2627693F9BB167DC01BE34AC494C60B8A0F65A28D7A31EA0D54640653A8099CE5A84E4F0168D818AF02041", 16);
        Fp2Element xP2 = new Fp2Element(x0, x1);
        y0 = new BigInteger("00000BF6E4E7A28E9A6EF66A2F1614AE2A2B5A583C9F2DC6C83F84E2D9E6577F9E22B991D58FB2F89666DC1D40A2C0A3AB876CF8DA8878F12325BF8B0CF92E45AE00627041C891BC96FFBB874FC587E4342F78098258DF2E10A5708A70A0D5A8", 16);
        y1 = new BigInteger("00001502FB44178D1DF80A53858519CBCF233FE387905BC8F9E4138703C6DB7C82302FBFB7E97153F6001FE9102D2597AC2B300A1C669D1A2803F8D05BA3B1F2ACBF27BC1A127B4A553916D62004FD21633C5AEAAB74833853B4C5C42EB71F7E", 16);
        Fp2Element yP2 = new Fp2Element(y0, y1);
        P2 = new ECPoint(xP2, yP2);

        //System.out.println(curve.xDBLe(P2, e2));
        x0 = new BigInteger("00006066E07F3C0D964E8BC963519FAC8397DF477AEA9A067F3BE343BC53C883AF29CCF008E5A30719A29357A8C33EB3600CD078AF1C40ED5792763A4D213EBDE44CC623195C387E0201E7231C529A15AF5AB743EE9E7C9C37AF3051167525BB", 16);
        x1 = new BigInteger("000050E30C2C06494249BC4A144EB5F31212BD05A2AF0CB3064C322FC3604FC5F5FE3A08FB3A02B05A48557E15C992254FFC8910B72B8E1328B4893CDCFBFC003878881CE390D909E39F83C5006E0AE979587775443483D13C65B107FADA5165", 16);
        xR2 = new Fp2Element(x0, x1);

        x0 = new BigInteger("00005BF9544781803CBD7E0EA8B96D934C5CBCA970F9CC327A0A7E4DAD931EC29BAA8A854B8A9FDE5409AF96C5426FA375D99C68E9AE714172D7F04502D45307FA4839F39A28338BBAFD54A461A535408367D5132E6AA0D3DA6973360F8CD0F1", 16);
        x1 = new BigInteger("00000000", 16);
        Fp2Element xQ3 = new Fp2Element(x0, x1);
        y0 = new BigInteger("00000000", 16);
        y1 = new BigInteger("00003351F421FC158472AC2DD8B4DABB5B599456748A5BCC4449398F05ED1AD1414B4EEBBB70FB91383474B712EA4B5BF096092CDDD57C0A090B041022064C3A8DD3D890E7B5AC34A24CEF507955F027CC4CECFDB67739CE89F31FDC5FE43243", 16);
        Fp2Element yQ3 = new Fp2Element(y0, y1);
        Q3 = new ECPoint(xQ3, yQ3);

        //System.out.println(curve.xTPLe(Q3, e3));
        x0 = new BigInteger("0000605D4697A245C394B98024A5554746DC12FF56D0C6F15D2F48123B6D9C498EEE98E8F7CD6E216E2F1FF7CE0C969CCA29CAA2FAA57174EF985AC0A504260018760E9FDF67467E20C13982FF5B49B8BEAB05F6023AF873F827400E453432FE", 16);
        x1 = new BigInteger("00000000", 16);
        Fp2Element xP3 = new Fp2Element(x0, x1);
        y0 = new BigInteger("00005634690BFC14C45E2FAA930D62589855E5BDD1435CFFBDF609628FD043B4BF295BB35F7B6D37836F2C59A27BB61ED0FF57FF8093FE6B712133D26502F17CB0D46CDC8CF9BA7664EA2B6C1672A8CA2FF1CE313FEEEF4199FC7F14FE720617", 16);
        y1 = new BigInteger("00000000", 16);
        Fp2Element yP3 = new Fp2Element(y0, y1);
        P3 = new ECPoint(xP3, yP3);

        //System.out.println(curve.xTPLe(P3, e3));
        x0 = new BigInteger("000055E5124A05D4809585F67FE9EA1F02A06CD411F38588BB631BF789C3F98D1C3325843BB53D9B011D8BD1F682C0E4D8A5E723364364E40DAD1B7A476716AC7D1BA705CCDD680BFD4FE4739CC21A9A59ED544B82566BF633E8950186A79FE3", 16);
        x1 = new BigInteger("00005AC57EAFD6CC7569E8B53A148721953262C5B404C143380ADCC184B6C21F0CAFE095B7E9C79CA88791F9A72F1B2F3121829B2622515B694A16875ED637F421B539E66F2FEF1CE8DCEFC8AEA608055E9C44077266AB64611BF851BA06C821", 16);
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
