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
public class SIKEp610 extends Parameters {

    public SIKEp610() {
        p = new BigInteger("000000027BF6A768819010C251E7D88CB255B2FA10C4252A9AE7BF45048FF9ABB1784DE8AA5AB02E6E01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 16);
        e2 = 0x131;
        e3 = 0xC0;
        super.init();

        BigInteger x0, x1, y0, y1;

        x0 = new BigInteger("25DA39EC90CDFB9BC0F772CDA52CB8B5A9F478D7AF8DBBA0AEB3E52432822DD88C38F4E3AEC0746E56149F1FE89707C77F8BA4134568629724F4A8E34B06BFE5C5E66E0867EC38B283798B8A", 16);
        x1 = new BigInteger("00000002250E1959256AE502428338CB4715399551AEC78D8935B2DC73FCDCFBDB1A0118A2D3EF03489BA6F637B1C7FEE7E5F31340A1A537B76B5B736B4CDD284918918E8C986FC02741FB8C98F0A0ED", 16);
        Fp2Element xQ2 = new Fp2Element(x0, x1);
        y0 = new BigInteger("A4FD5539025C0611E4B1CEC3C36F0D7590C035D3A25AD93022849CCEB3F67E4B1DBE988404290DD8B87B8D5E69ED3B0C5CDBCA248DC9D174CF762012CFE2D725CFD92057F2DBF8B04C7B12CC", 16);
        y1 = new BigInteger("0000000201C807BD738624E22B87554A2E053A46A9573BA863D4A9D309533E30B27BF7DD8137F5CE0F79C263D9D050541D69817A839085A76395F879315F6999E3441FC8FB3936DEE1BEF5B4E0E25096", 16);
        Fp2Element yQ2 = new Fp2Element(y0, y1);
        Q2 = new ECPoint(xQ2, yQ2);

        //System.out.println(curve.xDBLe(Q2, e2));
        x0 = new BigInteger("00000001B368BC6019B46CD802129209B3E65B98BC64A92BC4DB2F9F3AC96B97A1B9C124DF549B528F18BEECB1666D27D47530435E84221272F3A97FB80527D8F8A359F8F1598D365744CA3070A5F26C", 16);
        x1 = new BigInteger("00000001459685DCA7112D1F6030DBC98F2C9CBB41617B6AD913E6523416CCBD8ED9C7841D97DF83092B9B3F2AF00D62E08DAD8FA743CBCCCC1782BE0186A3432D3C97C37CA16873BEDE01F0637C1AA2", 16);
        Fp2Element xP2 = new Fp2Element(x0, x1);
        y0 = new BigInteger("00000001CD75CF512FFA9DF878EF495001A57ABC07FC7CE9BB488BB52DDCD7272D8A4FD17DD258ED3F844C862CF48803B9AC2668C7CB79C396128763B578080C30D14CA7EB709F98E3E682A391FB35A7", 16);
        y1 = new BigInteger("00000002001062A6289E4082CED884029207A1ACDEC525D7BC165A6CFF8BB469A8588950A416DBB924D2D673E3D6C32D232F6E6ADA62B37608F652C0B8628827B304BF1365D8211346207B24EFF09458", 16);
        Fp2Element yP2 = new Fp2Element(y0, y1);
        P2 = new ECPoint(xP2, yP2);

        //System.out.println(curve.xDBLe(P2, e2));
        x0 = new BigInteger("00000001B36A006D05F9E370D5078CCA54A16845B2BFF737C865368707C0DBBE9F5A62A9B9C79ADF11932A9FA4806210E25C92DB019CC146706DFBC7FA2638ECC4343C1E390426FAA7F2F07FDA163FB5", 16);
        x1 = new BigInteger("0000000183C9ABF2297CA69699357F58FED92553436BBEBA2C3600D89522E7009D19EA5D6C18CFF993AA3AA33923ED93592B0637ED0B33ADF12388AE912BC4AE4749E2DF3C3292994DCF37747518A992", 16);
        xR2 = new Fp2Element(x0, x1);

        x0 = new BigInteger("000000014E647CB19B7EAAAC640A9C26B9C26DB7DEDA8FC9399F4F8CE620D2B2200480F4338755AE16D0E090F15EA1882166836A478C6E161C938E4EB8C2DD779B45FFDD17DCDF158AF48DE126B3A047", 16);
        x1 = new BigInteger("00000000", 16);
        Fp2Element xQ3 = new Fp2Element(x0, x1);
        y0 = new BigInteger("00000000", 16);
        y1 = new BigInteger("E674067F5EA6DE85545C0A99E9E71E64FABFDC281D1E540FEDA47A56ED3ADCDDE1841083FABC7954B467C71AC6349B04974A7F9B688C5F735632FEB394146B0A080880069D8DA3324EDF795B", 16);
        Fp2Element yQ3 = new Fp2Element(y0, y1);
        Q3 = new ECPoint(xQ3, yQ3);

        //System.out.println(curve.xTPLe(Q3, e3));
        x0 = new BigInteger("00000001587822E647707ED4313D3BE6A811A694FB201561111838A0816BFB5DEC625D23772DE48A26D78C04EEB26CA4A571C67CE4DC4C620282876B2F2FC2633CA548C3AB0C45CC991417A56F7FEFEB", 16);
        x1 = new BigInteger("00000000", 16);
        Fp2Element xP3 = new Fp2Element(x0, x1);
        y0 = new BigInteger("14F295114B69D4769AC06DD07F051AD1114BCB7FA6B6EDE19F840969AFD56FD1F728907D3320A0309462A9444D24FE754666DB2470080951B31C2AC59704ABC7670C3C3A992C3C1629791F30", 16);
        y1 = new BigInteger("00000000", 16);
        Fp2Element yP3 = new Fp2Element(y0, y1);
        P3 = new ECPoint(xP3, yP3);

        //System.out.println(curve.xTPLe(P3, e3));
        x0 = new BigInteger("00000001DB73BC2DE666D24E59AF5E23B79251BA0D189629EF87E56C38778A448FACE312D08EDFB876C3FD45ECF3746D96E2CADBBA08B1A206C47DDD93137059E34C90E2E42E10F30F6E5F52DED74222", 16);
        x1 = new BigInteger("00000001B2C30180DAF5D91871555CE8EFEC76A4D521F877B754311228C7180A3E2318B4E7A00341FF99F34E35BF7A1053CA76FD77C0AFAE38E2091862AB4F1DD4C8D9C83DE37ACBA6646EDB4C238B48", 16);
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
