import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.tokens;
        java.lang.String str15 = endpointState9.endpoint;
        java.lang.String str16 = endpointState9.dc;
        java.lang.String str17 = endpointState9.status;
        java.lang.String str18 = endpointState9.hostId;
        java.lang.String str19 = endpointState9.status;
        java.lang.String str20 = endpointState9.toString();
        java.lang.String str21 = endpointState9.rack;
        java.lang.String str22 = endpointState9.endpoint;
        java.lang.String str23 = endpointState9.status;
        java.lang.Class<?> wildcardClass24 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str20, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 10.0d, (java.util.Set<java.lang.String>) strSet19);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap7, (java.lang.Double) 100.0d, (java.util.Set<java.lang.String>) strSet19);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 1.0d, (java.util.Set<java.lang.String>) strSet19);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo25 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap1, (java.lang.Double) 10.0d, (java.util.Set<java.lang.String>) strSet19);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.releaseVersion;
        java.lang.String str12 = endpointState9.hostId;
        java.lang.String str13 = endpointState9.dc;
        java.lang.String str14 = endpointState9.rack;
        java.lang.String str15 = endpointState9.hostId;
        java.lang.String str16 = endpointState9.toString();
        java.lang.String str17 = endpointState9.endpoint;
        java.lang.String str18 = endpointState9.rack;
        java.lang.String str19 = endpointState9.endpoint;
        java.lang.String str20 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "", (java.lang.Double) 100.0d, "hi!", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.tokens;
        java.lang.String str11 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) (-1.0d), "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getRack();
        java.lang.String str13 = endpointState9.rack;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.endpoint;
        java.lang.String str16 = endpointState9.endpoint;
        java.lang.String str17 = endpointState9.releaseVersion;
        java.lang.String str18 = endpointState9.getDc();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str10, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", (java.lang.Double) 0.0d, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "hi!", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) (-1.0d), "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap2);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList4 = nodesStatus3.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList5 = nodesStatus3.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus6 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList5);
        org.junit.Assert.assertNotNull(gossipInfoList4);
        org.junit.Assert.assertNotNull(gossipInfoList5);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d, "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.tokens;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) 0.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 1.0d, "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo12 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet13 = gossipInfo12.endpointNames;
        java.lang.String str14 = gossipInfo12.sourceNode;
        java.util.Set<java.lang.String> strSet15 = gossipInfo12.endpointNames;
        java.lang.String str16 = gossipInfo12.sourceNode;
        java.lang.String str17 = gossipInfo12.sourceNode;
        java.util.Set<java.lang.String> strSet18 = gossipInfo12.endpointNames;
        java.util.Set<java.lang.String> strSet19 = gossipInfo12.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo20 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap1, (java.lang.Double) (-1.0d), strSet19);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo12 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet13 = gossipInfo12.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo14 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 1.0d, strSet13);
        java.lang.String str15 = gossipInfo14.sourceNode;
        java.lang.String str16 = gossipInfo14.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap17 = gossipInfo14.endpoints;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str15, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo18 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap10, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet16);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo19 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet16);
        java.lang.String str20 = gossipInfo19.sourceNode;
        java.lang.String str21 = gossipInfo19.sourceNode;
        java.util.Set<java.lang.String> strSet22 = gossipInfo19.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 1.0d, strSet22);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) (-1.0d), strSet22);
        java.lang.String str25 = gossipInfo24.sourceNode;
        java.lang.String str26 = gossipInfo24.sourceNode;
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str20, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str21, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str25, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str26, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap19, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet25);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap28 = gossipInfo27.endpoints;
        java.util.Set<java.lang.String> strSet29 = gossipInfo27.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap16, (java.lang.Double) 1.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo31 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap13, (java.lang.Double) 100.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo32 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 10.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo33 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) 0.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo34 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap4, (java.lang.Double) 100.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo35 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 1.0d, strSet29);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap22 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap25 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo33 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap25, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo34 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap22, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo35 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap19, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo36 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap16, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo37 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap13, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo38 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap10, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo39 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", strMap7, (java.lang.Double) 10.0d, (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo40 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap4, (java.lang.Double) 100.0d, (java.util.Set<java.lang.String>) strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo41 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap1, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet31);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "", "hi!", (java.lang.Double) 10.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.status;
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.tokens;
        java.lang.String str15 = endpointState9.tokens;
        java.lang.String str16 = endpointState9.getRack();
        java.lang.String str17 = endpointState9.releaseVersion;
        java.lang.String str18 = endpointState9.hostId;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str15, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str17, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap19, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet25);
        java.util.Set<java.lang.String> strSet28 = gossipInfo27.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo29 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap16, (java.lang.Double) 1.0d, strSet28);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap13, (java.lang.Double) 0.0d, strSet28);
        java.util.Set<java.lang.String> strSet31 = gossipInfo30.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo32 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap10, (java.lang.Double) 0.0d, strSet31);
        java.util.Set<java.lang.String> strSet33 = gossipInfo32.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo34 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) 100.0d, strSet33);
        java.util.Set<java.lang.String> strSet35 = gossipInfo34.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo36 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap4, (java.lang.Double) 100.0d, strSet35);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo37 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 100.0d, strSet35);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap38 = gossipInfo37.endpoints;
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(strMap38);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo15 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet13);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = gossipInfo15.endpoints;
        java.util.Set<java.lang.String> strSet17 = gossipInfo15.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo18 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 1.0d, strSet17);
        java.util.Set<java.lang.String> strSet19 = gossipInfo18.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo20 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap1, (java.lang.Double) 100.0d, strSet19);
        java.util.Set<java.lang.String> strSet21 = gossipInfo20.endpointNames;
        java.lang.String str22 = gossipInfo20.sourceNode;
        java.lang.String str23 = gossipInfo20.sourceNode;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str22, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str23, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.tokens;
        java.lang.String str11 = endpointState9.releaseVersion;
        java.lang.String str12 = endpointState9.status;
        java.lang.String str13 = endpointState9.rack;
        java.lang.String str14 = endpointState9.status;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.dc;
        java.lang.String str16 = endpointState9.tokens;
        java.lang.String str17 = endpointState9.getRack();
        java.lang.String str18 = endpointState9.getRack();
        java.lang.String str19 = endpointState9.releaseVersion;
        java.lang.Class<?> wildcardClass20 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d, "", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d, "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.dc;
        java.lang.String str11 = endpointState9.getDc();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.getRack();
        java.lang.String str14 = endpointState9.rack;
        java.lang.String str15 = endpointState9.dc;
        java.lang.String str16 = endpointState9.releaseVersion;
        java.lang.String str17 = endpointState9.releaseVersion;
        java.lang.String str18 = endpointState9.rack;
        java.lang.String str19 = endpointState9.releaseVersion;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap22 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap22, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet28);
        java.util.Set<java.lang.String> strSet31 = gossipInfo30.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo32 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap19, (java.lang.Double) 1.0d, strSet31);
        java.util.Set<java.lang.String> strSet33 = gossipInfo32.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo34 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap16, (java.lang.Double) 100.0d, strSet33);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo35 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap13, (java.lang.Double) 100.0d, strSet33);
        java.util.Set<java.lang.String> strSet36 = gossipInfo35.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo37 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap10, (java.lang.Double) (-1.0d), strSet36);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo38 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap7, (java.lang.Double) 100.0d, strSet36);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo39 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) (-1.0d), strSet36);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo40 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 0.0d, strSet36);
        java.lang.String str41 = gossipInfo40.sourceNode;
        java.lang.String str42 = gossipInfo40.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap43 = gossipInfo40.endpoints;
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str41, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str42, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNull(strMap43);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) 100.0d, "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.status;
        java.lang.String str16 = endpointState9.status;
        java.lang.Class<?> wildcardClass17 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap16, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet22);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo25 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap13, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet22);
        java.lang.String str26 = gossipInfo25.sourceNode;
        java.lang.String str27 = gossipInfo25.sourceNode;
        java.util.Set<java.lang.String> strSet28 = gossipInfo25.endpointNames;
        java.util.Set<java.lang.String> strSet29 = gossipInfo25.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap10, (java.lang.Double) 10.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo31 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap7, (java.lang.Double) 1.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo32 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap4, (java.lang.Double) 1.0d, strSet29);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo33 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 1.0d, strSet29);
        java.util.Set<java.lang.String> strSet34 = gossipInfo33.endpointNames;
        java.lang.String str35 = gossipInfo33.sourceNode;
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str26, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str27, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str35, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap2);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList4 = nodesStatus3.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus5 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus6 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus7 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus8 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList9 = nodesStatus8.endpointStates;
        org.junit.Assert.assertNotNull(gossipInfoList4);
        org.junit.Assert.assertNotNull(gossipInfoList9);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) 1.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.hostId;
        java.lang.String str12 = endpointState9.endpoint;
        java.lang.String str13 = endpointState9.status;
        java.lang.String str14 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d, "", "", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.rack;
        java.lang.String str11 = endpointState9.getDc();
        java.lang.String str12 = endpointState9.tokens;
        java.lang.String str13 = endpointState9.tokens;
        java.lang.String str14 = endpointState9.status;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        java.util.Set<java.lang.String> strSet22 = gossipInfo21.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 1.0d, strSet22);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap7, (java.lang.Double) 0.0d, strSet22);
        java.util.Set<java.lang.String> strSet25 = gossipInfo24.endpointNames;
        java.util.Set<java.lang.String> strSet26 = gossipInfo24.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap4, (java.lang.Double) 100.0d, strSet26);
        java.util.Set<java.lang.String> strSet28 = gossipInfo27.endpointNames;
        java.util.Set<java.lang.String> strSet29 = gossipInfo27.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) (-1.0d), strSet29);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "", "hi!", (java.lang.Double) 10.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.getRack();
        java.lang.String str11 = endpointState9.getRack();
        java.lang.String str12 = endpointState9.tokens;
        java.lang.String str13 = endpointState9.rack;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "hi!", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", (java.lang.Double) (-1.0d), "", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.getDc();
        java.lang.String str12 = endpointState9.endpoint;
        java.lang.String str13 = endpointState9.rack;
        java.lang.String str14 = endpointState9.getDc();
        java.lang.String str15 = endpointState9.endpoint;
        java.lang.String str16 = endpointState9.hostId;
        java.lang.String str17 = endpointState9.toString();
        java.lang.String str18 = endpointState9.tokens;
        java.lang.String str19 = endpointState9.hostId;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str17, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d, "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", (java.lang.Double) 100.0d);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getRack();
        java.lang.String str13 = endpointState9.hostId;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.getDc();
        java.lang.String str16 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.dc;
        java.lang.String str15 = endpointState9.tokens;
        java.lang.String str16 = endpointState9.dc;
        java.lang.String str17 = endpointState9.endpoint;
        java.lang.String str18 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo18 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap10, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet16);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = gossipInfo18.endpoints;
        java.util.Set<java.lang.String> strSet20 = gossipInfo18.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap7, (java.lang.Double) 0.0d, strSet20);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 1.0d, strSet20);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) (-1.0d), strSet20);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", (java.lang.Double) 1.0d, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 1.0d, (java.util.Set<java.lang.String>) strSet19);
        java.util.Set<java.lang.String> strSet23 = gossipInfo22.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap7, (java.lang.Double) 1.0d, strSet23);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo25 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 1.0d, strSet23);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap26 = gossipInfo25.endpoints;
        java.util.Set<java.lang.String> strSet27 = gossipInfo25.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo28 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", strMap1, (java.lang.Double) 0.0d, strSet27);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", (java.lang.Double) (-1.0d), "", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 10.0d);
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.status;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.endpoint;
        java.lang.String str11 = endpointState9.getDc();
        java.lang.String str12 = endpointState9.releaseVersion;
        java.lang.String str13 = endpointState9.dc;
        java.lang.String str14 = endpointState9.getDc();
        java.lang.String str15 = endpointState9.releaseVersion;
        java.lang.String str16 = endpointState9.getDc();
        java.lang.String str17 = endpointState9.tokens;
        java.lang.String str18 = endpointState9.toString();
        java.lang.String str19 = endpointState9.endpoint;
        java.lang.String str20 = endpointState9.hostId;
        java.lang.String str21 = endpointState9.dc;
        java.lang.String str22 = endpointState9.hostId;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap16, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet22);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap25 = gossipInfo24.endpoints;
        java.util.Set<java.lang.String> strSet26 = gossipInfo24.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap13, (java.lang.Double) 1.0d, strSet26);
        java.util.Set<java.lang.String> strSet28 = gossipInfo27.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo29 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap10, (java.lang.Double) 100.0d, strSet28);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) 10.0d, strSet28);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo31 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap4, (java.lang.Double) (-1.0d), strSet28);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo32 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap1, (java.lang.Double) 1.0d, strSet28);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap33 = gossipInfo32.endpoints;
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(strMap33);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        java.util.Set<java.lang.String> strSet22 = gossipInfo21.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 1.0d, strSet22);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap7, (java.lang.Double) 0.0d, strSet22);
        java.util.Set<java.lang.String> strSet25 = gossipInfo24.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo26 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap4, (java.lang.Double) 0.0d, strSet25);
        java.util.Set<java.lang.String> strSet27 = gossipInfo26.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo28 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 100.0d, strSet27);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap29 = gossipInfo28.endpoints;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap30 = gossipInfo28.endpoints;
        java.util.Set<java.lang.String> strSet31 = gossipInfo28.endpointNames;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap32 = gossipInfo28.endpoints;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap33 = gossipInfo28.endpoints;
        java.util.Set<java.lang.String> strSet34 = gossipInfo28.endpointNames;
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) 0.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", (java.lang.Double) 0.0d);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!", (java.lang.Double) 0.0d, "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "hi!", (java.lang.Double) 0.0d, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", (java.lang.Double) 10.0d, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.dc;
        java.lang.String str11 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo18 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap10, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet16);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo19 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet16);
        java.lang.String str20 = gossipInfo19.sourceNode;
        java.util.Set<java.lang.String> strSet21 = gossipInfo19.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) (-1.0d), strSet21);
        java.lang.String str23 = gossipInfo22.sourceNode;
        java.lang.String str24 = gossipInfo22.sourceNode;
        java.util.Set<java.lang.String> strSet25 = gossipInfo22.endpointNames;
        java.util.Set<java.lang.String> strSet26 = gossipInfo22.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 1.0d, strSet26);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str20, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str23, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str24, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) 0.0d, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.status;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo12 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet10);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = gossipInfo12.endpoints;
        java.util.Set<java.lang.String> strSet14 = gossipInfo12.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo15 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 10.0d, strSet14);
        java.lang.String str16 = gossipInfo15.sourceNode;
        java.util.Set<java.lang.String> strSet17 = gossipInfo15.endpointNames;
        java.lang.String str18 = gossipInfo15.sourceNode;
        java.lang.String str19 = gossipInfo15.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap20 = gossipInfo15.endpoints;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap21 = gossipInfo15.endpoints;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str19, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.dc;
        java.lang.String str13 = endpointState9.rack;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.rack;
        java.lang.String str16 = endpointState9.getRack();
        java.lang.String str17 = endpointState9.getRack();
        java.lang.Class<?> wildcardClass18 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.releaseVersion;
        java.lang.String str12 = endpointState9.toString();
        java.lang.String str13 = endpointState9.status;
        java.lang.String str14 = endpointState9.tokens;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d), "", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo15 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet13);
        java.util.Set<java.lang.String> strSet16 = gossipInfo15.endpointNames;
        java.util.Set<java.lang.String> strSet17 = gossipInfo15.endpointNames;
        java.util.Set<java.lang.String> strSet18 = gossipInfo15.endpointNames;
        java.lang.String str19 = gossipInfo15.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap20 = gossipInfo15.endpoints;
        java.util.Set<java.lang.String> strSet21 = gossipInfo15.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 0.0d, strSet21);
        java.util.Set<java.lang.String> strSet23 = gossipInfo22.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", strMap1, (java.lang.Double) 0.0d, strSet23);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 1.0d, "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.rack;
        java.lang.String str11 = endpointState9.hostId;
        java.lang.String str12 = endpointState9.hostId;
        java.lang.String str13 = endpointState9.tokens;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus("Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap2);
        java.lang.Class<?> wildcardClass4 = nodesStatus3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.String str11 = endpointState9.tokens;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d, "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.status;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.getRack();
        java.lang.Class<?> wildcardClass12 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo18 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap10, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet16);
        java.util.Set<java.lang.String> strSet19 = gossipInfo18.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo20 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) 1.0d, strSet19);
        java.util.Set<java.lang.String> strSet21 = gossipInfo20.endpointNames;
        java.util.Set<java.lang.String> strSet22 = gossipInfo20.endpointNames;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap23 = gossipInfo20.endpoints;
        java.util.Set<java.lang.String> strSet24 = gossipInfo20.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo25 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 100.0d, strSet24);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo26 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) (-1.0d), strSet24);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d, "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.Class<?> wildcardClass11 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "", "hi!", "", "hi!", (java.lang.Double) 1.0d, "hi!", "", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.toString();
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.getDc();
        java.lang.String str16 = endpointState9.getRack();
        java.lang.String str17 = endpointState9.hostId;
        java.lang.String str18 = endpointState9.releaseVersion;
        java.lang.String str19 = endpointState9.hostId;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "hi!", "", "hi!", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.rack;
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.status;
        java.lang.String str13 = endpointState9.getRack();
        java.lang.String str14 = endpointState9.getDc();
        java.lang.Class<?> wildcardClass15 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str11, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap16, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet22);
        java.lang.String str25 = gossipInfo24.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap26 = gossipInfo24.endpoints;
        java.util.Set<java.lang.String> strSet27 = gossipInfo24.endpointNames;
        java.util.Set<java.lang.String> strSet28 = gossipInfo24.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo29 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap13, (java.lang.Double) 100.0d, strSet28);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap10, (java.lang.Double) 100.0d, strSet28);
        java.util.Set<java.lang.String> strSet31 = gossipInfo30.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo32 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) 100.0d, strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo33 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 1.0d, strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo34 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 1.0d, strSet31);
        java.lang.String str35 = gossipInfo34.sourceNode;
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str35, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "hi!", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 0.0d, "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.status;
        java.lang.String str11 = endpointState9.getDc();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str11, "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.tokens;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "", "hi!", (java.lang.Double) 10.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.endpoint;
        java.lang.String str13 = endpointState9.endpoint;
        java.lang.String str14 = endpointState9.endpoint;
        java.lang.String str15 = endpointState9.dc;
        java.lang.String str16 = endpointState9.rack;
        java.lang.String str17 = endpointState9.getRack();
        java.lang.String str18 = endpointState9.getDc();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.dc;
        java.lang.String str13 = endpointState9.rack;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.releaseVersion;
        java.lang.String str16 = endpointState9.getRack();
        java.lang.String str17 = endpointState9.hostId;
        java.lang.String str18 = endpointState9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap2);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList4 = nodesStatus3.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList5 = nodesStatus3.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList6 = nodesStatus3.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList7 = nodesStatus3.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList8 = nodesStatus3.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList9 = nodesStatus3.endpointStates;
        org.junit.Assert.assertNotNull(gossipInfoList4);
        org.junit.Assert.assertNotNull(gossipInfoList5);
        org.junit.Assert.assertNotNull(gossipInfoList6);
        org.junit.Assert.assertNotNull(gossipInfoList7);
        org.junit.Assert.assertNotNull(gossipInfoList8);
        org.junit.Assert.assertNotNull(gossipInfoList9);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap2);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList4 = nodesStatus3.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus5 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus6 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList7 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList8 = nodesStatus6.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus9 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList8);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus10 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList8);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList11 = nodesStatus10.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList12 = nodesStatus10.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList13 = nodesStatus10.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList14 = nodesStatus10.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList15 = nodesStatus10.endpointStates;
        org.junit.Assert.assertNotNull(gossipInfoList4);
        org.junit.Assert.assertNotNull(gossipInfoList7);
        org.junit.Assert.assertNotNull(gossipInfoList8);
        org.junit.Assert.assertNotNull(gossipInfoList11);
        org.junit.Assert.assertNotNull(gossipInfoList12);
        org.junit.Assert.assertNotNull(gossipInfoList13);
        org.junit.Assert.assertNotNull(gossipInfoList14);
        org.junit.Assert.assertNotNull(gossipInfoList15);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.String str11 = endpointState9.toString();
        java.lang.String str12 = endpointState9.getRack();
        java.lang.String str13 = endpointState9.endpoint;
        java.lang.String str14 = endpointState9.getRack();
        java.lang.String str15 = endpointState9.rack;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d), "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.hostId;
        java.lang.String str11 = endpointState9.rack;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str11, "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", (java.lang.Double) 0.0d, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo15 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet13);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo16 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet13);
        java.lang.String str17 = gossipInfo16.sourceNode;
        java.lang.String str18 = gossipInfo16.sourceNode;
        java.lang.String str19 = gossipInfo16.sourceNode;
        java.util.Set<java.lang.String> strSet20 = gossipInfo16.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap1, (java.lang.Double) 10.0d, strSet20);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap22 = gossipInfo21.endpoints;
        java.lang.String str23 = gossipInfo21.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap24 = gossipInfo21.endpoints;
        java.lang.String str25 = gossipInfo21.sourceNode;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str17, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str19, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap22 = gossipInfo21.endpoints;
        java.util.Set<java.lang.String> strSet23 = gossipInfo21.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 10.0d, strSet23);
        java.util.Set<java.lang.String> strSet25 = gossipInfo24.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo26 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap7, (java.lang.Double) (-1.0d), strSet25);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 100.0d, strSet25);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo28 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 0.0d, strSet25);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet19);
        java.lang.String str23 = gossipInfo22.sourceNode;
        java.lang.String str24 = gossipInfo22.sourceNode;
        java.lang.String str25 = gossipInfo22.sourceNode;
        java.util.Set<java.lang.String> strSet26 = gossipInfo22.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap7, (java.lang.Double) 10.0d, strSet26);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo28 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap4, (java.lang.Double) 1.0d, strSet26);
        java.util.Set<java.lang.String> strSet29 = gossipInfo28.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) (-1.0d), strSet29);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap31 = gossipInfo30.endpoints;
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str23, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str24, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str25, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(strMap31);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.getRack();
        java.lang.String str14 = endpointState9.rack;
        java.lang.String str15 = endpointState9.dc;
        java.lang.String str16 = endpointState9.dc;
        java.lang.String str17 = endpointState9.releaseVersion;
        java.lang.String str18 = endpointState9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.dc;
        java.lang.String str15 = endpointState9.tokens;
        java.lang.String str16 = endpointState9.toString();
        java.lang.String str17 = endpointState9.endpoint;
        java.lang.String str18 = endpointState9.toString();
        java.lang.String str19 = endpointState9.toString();
        java.lang.String str20 = endpointState9.rack;
        java.lang.Class<?> wildcardClass21 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str19, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 1.0d, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d);
        java.lang.String str10 = endpointState9.getRack();
        java.lang.String str11 = endpointState9.releaseVersion;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str11, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) 1.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.getRack();
        java.lang.String str12 = endpointState9.tokens;
        java.lang.String str13 = endpointState9.tokens;
        java.lang.String str14 = endpointState9.getDc();
        java.lang.String str15 = endpointState9.toString();
        java.lang.String str16 = endpointState9.hostId;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str15, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo9 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap1, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet7);
        java.util.Set<java.lang.String> strSet10 = gossipInfo9.endpointNames;
        java.lang.String str11 = gossipInfo9.sourceNode;
        java.util.Set<java.lang.String> strSet12 = gossipInfo9.endpointNames;
        java.util.Set<java.lang.String> strSet13 = gossipInfo9.endpointNames;
        java.util.Set<java.lang.String> strSet14 = gossipInfo9.endpointNames;
        java.lang.String str15 = gossipInfo9.sourceNode;
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.String str11 = endpointState9.toString();
        java.lang.String str12 = endpointState9.toString();
        java.lang.String str13 = endpointState9.toString();
        java.lang.String str14 = endpointState9.dc;
        java.lang.String str15 = endpointState9.getDc();
        java.lang.String str16 = endpointState9.tokens;
        java.lang.String str17 = endpointState9.getDc();
        java.lang.String str18 = endpointState9.toString();
        java.lang.String str19 = endpointState9.getDc();
        java.lang.String str20 = endpointState9.tokens;
        java.lang.String str21 = endpointState9.status;
        java.lang.String str22 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d), "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.rack;
        java.lang.Class<?> wildcardClass12 = endpointState9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 10.0d, "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) 10.0d);
        java.lang.String str10 = endpointState9.hostId;
        java.lang.String str11 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str10, "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "hi!", "hi!", "hi!", "", (java.lang.Double) 100.0d, "hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d);
        java.lang.String str10 = endpointState9.getRack();
        java.lang.String str11 = endpointState9.status;
        java.lang.String str12 = endpointState9.tokens;
        java.lang.String str13 = endpointState9.tokens;
        java.lang.String str14 = endpointState9.getDc();
        java.lang.String str15 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo12 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet10);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo13 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet10);
        java.lang.String str14 = gossipInfo13.sourceNode;
        java.lang.String str15 = gossipInfo13.sourceNode;
        java.lang.String str16 = gossipInfo13.sourceNode;
        java.util.Set<java.lang.String> strSet17 = gossipInfo13.endpointNames;
        java.util.Set<java.lang.String> strSet18 = gossipInfo13.endpointNames;
        java.lang.String str19 = gossipInfo13.sourceNode;
        java.lang.String str20 = gossipInfo13.sourceNode;
        java.util.Set<java.lang.String> strSet21 = gossipInfo13.endpointNames;
        java.lang.String str22 = gossipInfo13.sourceNode;
        java.lang.String str23 = gossipInfo13.sourceNode;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str15, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str19, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str20, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str22, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str23, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", (java.lang.Double) 100.0d, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.status;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d, "hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str10 = endpointState9.rack;
        java.lang.String str11 = endpointState9.toString();
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.endpoint;
        java.lang.String str14 = endpointState9.dc;
        java.lang.String str15 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str11, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) (-1.0d), "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version : hi! / Load : 0.0 / Severity : 100.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 0.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d);
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.hostId;
        java.lang.String str12 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo[] gossipInfoArray0 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo[] {};
        java.util.ArrayList<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList1 = new java.util.ArrayList<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>) gossipInfoList1, gossipInfoArray0);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus((java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>) gossipInfoList1);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus4 = new io.cassandrareaper.resources.view.NodesStatus((java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>) gossipInfoList1);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus5 = new io.cassandrareaper.resources.view.NodesStatus((java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>) gossipInfoList1);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus6 = new io.cassandrareaper.resources.view.NodesStatus((java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>) gossipInfoList1);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus7 = new io.cassandrareaper.resources.view.NodesStatus((java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>) gossipInfoList1);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus8 = new io.cassandrareaper.resources.view.NodesStatus((java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo>) gossipInfoList1);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList9 = nodesStatus8.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus10 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList9);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus11 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList9);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus12 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList9);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList13 = nodesStatus12.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList14 = nodesStatus12.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList15 = nodesStatus12.endpointStates;
        org.junit.Assert.assertNotNull(gossipInfoArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gossipInfoList9);
        org.junit.Assert.assertNotNull(gossipInfoList13);
        org.junit.Assert.assertNotNull(gossipInfoList14);
        org.junit.Assert.assertNotNull(gossipInfoList15);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d, "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", (java.lang.Double) (-1.0d));
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo15 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet13);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo16 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) (-1.0d), (java.util.Set<java.lang.String>) strSet13);
        java.lang.String str17 = gossipInfo16.sourceNode;
        java.lang.String str18 = gossipInfo16.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = gossipInfo16.endpoints;
        java.util.Set<java.lang.String> strSet20 = gossipInfo16.endpointNames;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap21 = gossipInfo16.endpoints;
        java.util.Set<java.lang.String> strSet22 = gossipInfo16.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap1, (java.lang.Double) (-1.0d), strSet22);
        java.util.Set<java.lang.String> strSet24 = gossipInfo23.endpointNames;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str17, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap22 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap22, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet28);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap31 = gossipInfo30.endpoints;
        java.util.Set<java.lang.String> strSet32 = gossipInfo30.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo33 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap19, (java.lang.Double) 1.0d, strSet32);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo34 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap16, (java.lang.Double) 100.0d, strSet32);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo35 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap13, (java.lang.Double) 1.0d, strSet32);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo36 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) (-1.0d), strSet32);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo37 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) 0.0d, strSet32);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo38 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", strMap4, (java.lang.Double) (-1.0d), strSet32);
        java.util.Set<java.lang.String> strSet39 = gossipInfo38.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo40 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) (-1.0d), strSet39);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "", "hi!", (java.lang.Double) 10.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.endpoint;
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.dc;
        java.lang.String str13 = endpointState9.tokens;
        java.lang.String str14 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.releaseVersion;
        java.lang.String str12 = endpointState9.hostId;
        java.lang.String str13 = endpointState9.dc;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 1.0d, "", "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass10 = endpointState9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo18 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap10, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet16);
        java.lang.String str19 = gossipInfo18.sourceNode;
        java.util.Set<java.lang.String> strSet20 = gossipInfo18.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap7, (java.lang.Double) 100.0d, strSet20);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap4, (java.lang.Double) 0.0d, strSet20);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 0.0d, strSet20);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) 10.0d, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", (java.lang.Double) 1.0d);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.getDc();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.releaseVersion;
        java.lang.String str12 = endpointState9.hostId;
        java.lang.String str13 = endpointState9.dc;
        java.lang.String str14 = endpointState9.rack;
        java.lang.String str15 = endpointState9.getDc();
        java.lang.String str16 = endpointState9.rack;
        java.lang.String str17 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "", "hi!", "", "hi!", (java.lang.Double) 1.0d, "hi!", "", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.hostId;
        java.lang.String str12 = endpointState9.toString();
        java.lang.String str13 = endpointState9.toString();
        java.lang.String str14 = endpointState9.dc;
        java.lang.String str15 = endpointState9.dc;
        java.lang.String str16 = endpointState9.getRack();
        java.lang.String str17 = endpointState9.rack;
        java.lang.String str18 = endpointState9.getRack();
        java.lang.String str19 = endpointState9.hostId;
        java.lang.String str20 = endpointState9.getDc();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap16, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet22);
        java.util.Set<java.lang.String> strSet25 = gossipInfo24.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo26 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap13, (java.lang.Double) 1.0d, strSet25);
        java.util.Set<java.lang.String> strSet27 = gossipInfo26.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo28 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap10, (java.lang.Double) 100.0d, strSet27);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo29 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) 100.0d, strSet27);
        java.util.Set<java.lang.String> strSet30 = gossipInfo29.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo31 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 100.0d, strSet30);
        java.util.Set<java.lang.String> strSet32 = gossipInfo31.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo33 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 10.0d, strSet32);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getRack();
        java.lang.String str13 = endpointState9.rack;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.rack;
        java.lang.String str16 = endpointState9.hostId;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d, "", "", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.status;
        java.lang.String str11 = endpointState9.rack;
        java.lang.String str12 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str11, "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.getDc();
        java.lang.String str12 = endpointState9.rack;
        java.lang.String str13 = endpointState9.rack;
        java.lang.String str14 = endpointState9.endpoint;
        java.lang.String str15 = endpointState9.hostId;
        java.lang.String str16 = endpointState9.getRack();
        java.lang.String str17 = endpointState9.releaseVersion;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.endpoint;
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.endpoint;
        java.lang.String str13 = endpointState9.endpoint;
        java.lang.String str14 = endpointState9.endpoint;
        java.lang.String str15 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "hi!", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.hostId;
        java.lang.String str11 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : " + "'", str11, "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ");
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "hi!", strMap2);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList4 = nodesStatus3.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus5 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList6 = nodesStatus5.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus7 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList6);
        org.junit.Assert.assertNotNull(gossipInfoList4);
        org.junit.Assert.assertNotNull(gossipInfoList6);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo22 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 1.0d, (java.util.Set<java.lang.String>) strSet19);
        java.util.Set<java.lang.String> strSet23 = gossipInfo22.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap7, (java.lang.Double) 1.0d, strSet23);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo25 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 100.0d, strSet23);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo26 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 100.0d, strSet23);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.tokens;
        java.lang.String str15 = endpointState9.endpoint;
        java.lang.String str16 = endpointState9.dc;
        java.lang.String str17 = endpointState9.status;
        java.lang.String str18 = endpointState9.hostId;
        java.lang.String str19 = endpointState9.status;
        java.lang.String str20 = endpointState9.toString();
        java.lang.String str21 = endpointState9.getDc();
        java.lang.String str22 = endpointState9.getRack();
        java.lang.String str23 = endpointState9.getDc();
        java.lang.String str24 = endpointState9.toString();
        java.lang.String str25 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str20, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str24, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.String str11 = endpointState9.getDc();
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.getDc();
        java.lang.String str14 = endpointState9.releaseVersion;
        java.lang.String str15 = endpointState9.tokens;
        java.lang.String str16 = endpointState9.toString();
        java.lang.String str17 = endpointState9.status;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d), "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.getRack();
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.dc;
        java.lang.String str13 = endpointState9.getDc();
        java.lang.String str14 = endpointState9.releaseVersion;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", (java.lang.Double) 1.0d, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "", "hi!", "", "hi!", (java.lang.Double) 1.0d, "hi!", "", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.toString();
        java.lang.String str12 = endpointState9.hostId;
        java.lang.String str13 = endpointState9.endpoint;
        java.lang.String str14 = endpointState9.status;
        java.lang.String str15 = endpointState9.rack;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo15 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet13);
        java.util.Set<java.lang.String> strSet16 = gossipInfo15.endpointNames;
        java.util.Set<java.lang.String> strSet17 = gossipInfo15.endpointNames;
        java.util.Set<java.lang.String> strSet18 = gossipInfo15.endpointNames;
        java.util.Set<java.lang.String> strSet19 = gossipInfo15.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo20 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("", strMap4, (java.lang.Double) 0.0d, strSet19);
        java.util.Set<java.lang.String> strSet21 = gossipInfo20.endpointNames;
        java.util.Set<java.lang.String> strSet22 = gossipInfo20.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo23 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap1, (java.lang.Double) 100.0d, strSet22);
        java.util.Set<java.lang.String> strSet24 = gossipInfo23.endpointNames;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap25 = gossipInfo23.endpoints;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(strMap25);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus3 = new io.cassandrareaper.resources.view.NodesStatus("hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap2);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList4 = nodesStatus3.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus5 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        io.cassandrareaper.resources.view.NodesStatus nodesStatus6 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList4);
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList7 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList8 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList9 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList10 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList11 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList12 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList13 = nodesStatus6.endpointStates;
        java.util.List<io.cassandrareaper.resources.view.NodesStatus.GossipInfo> gossipInfoList14 = nodesStatus6.endpointStates;
        io.cassandrareaper.resources.view.NodesStatus nodesStatus15 = new io.cassandrareaper.resources.view.NodesStatus(gossipInfoList14);
        org.junit.Assert.assertNotNull(gossipInfoList4);
        org.junit.Assert.assertNotNull(gossipInfoList7);
        org.junit.Assert.assertNotNull(gossipInfoList8);
        org.junit.Assert.assertNotNull(gossipInfoList9);
        org.junit.Assert.assertNotNull(gossipInfoList10);
        org.junit.Assert.assertNotNull(gossipInfoList11);
        org.junit.Assert.assertNotNull(gossipInfoList12);
        org.junit.Assert.assertNotNull(gossipInfoList13);
        org.junit.Assert.assertNotNull(gossipInfoList14);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 10.0 / Severity : 10.0 / Host Id : hi! / Tokens : ", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d), "", "", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.status;
        java.lang.String str11 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str11, "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo15 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet13);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = gossipInfo15.endpoints;
        java.util.Set<java.lang.String> strSet17 = gossipInfo15.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo18 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap4, (java.lang.Double) 10.0d, strSet17);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo19 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 100.0d, strSet17);
        java.lang.String str20 = gossipInfo19.sourceNode;
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str20, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Set<java.lang.String> strSet3 = null;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo4 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 1.0d, strSet3);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) 1.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.getRack();
        java.lang.String str12 = endpointState9.releaseVersion;
        java.lang.String str13 = endpointState9.status;
        java.lang.String str14 = endpointState9.hostId;
        java.lang.String str15 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str10, "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str12, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", "Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 10.0d, "hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str10 = endpointState9.status;
        java.lang.String str11 = endpointState9.dc;
        java.lang.String str12 = endpointState9.dc;
        java.lang.String str13 = endpointState9.tokens;
        java.lang.String str14 = endpointState9.status;
        java.lang.String str15 = endpointState9.toString();
        java.lang.String str16 = endpointState9.endpoint;
        java.lang.String str17 = endpointState9.releaseVersion;
        java.lang.String str18 = endpointState9.dc;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str15, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Status : hi! / DC : hi! / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 0.0d, "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 0.0d);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "hi!", "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) 0.0d, "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.getRack();
        java.lang.String str11 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap22 = gossipInfo21.endpoints;
        java.util.Set<java.lang.String> strSet23 = gossipInfo21.endpointNames;
        java.util.Set<java.lang.String> strSet24 = gossipInfo21.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo25 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 10.0d, strSet24);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo26 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap7, (java.lang.Double) 0.0d, strSet24);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap4, (java.lang.Double) 100.0d, strSet24);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo28 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap1, (java.lang.Double) 100.0d, strSet24);
        java.util.Set<java.lang.String> strSet29 = gossipInfo28.endpointNames;
        java.lang.String str30 = gossipInfo28.sourceNode;
        java.util.Set<java.lang.String> strSet31 = gossipInfo28.endpointNames;
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : " + "'", str30, "Endpoint : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : hi! / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : -1.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC :  / Rack : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Load : 1.0 / Severity : 100.0 / Host Id : hi! / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", "", (java.lang.Double) 10.0d, "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : hi! / Rack :  / Release version : Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Load : 0.0 / Severity : 0.0 / Host Id :  / Tokens : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "", "hi!", (java.lang.Double) 10.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.toString();
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.status;
        java.lang.String str13 = endpointState9.releaseVersion;
        java.lang.String str14 = endpointState9.tokens;
        java.lang.String str15 = endpointState9.tokens;
        java.lang.String str16 = endpointState9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str15, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "hi!", "", (java.lang.Double) 0.0d, "", "", (java.lang.Double) 1.0d);
        java.lang.String str10 = endpointState9.getDc();
        java.lang.String str11 = endpointState9.getDc();
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.status;
        java.lang.String str14 = endpointState9.getRack();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "hi!", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 0.0d, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) 100.0d);
        java.lang.String str10 = endpointState9.endpoint;
        java.lang.String str11 = endpointState9.tokens;
        java.lang.String str12 = endpointState9.rack;
        java.lang.String str13 = endpointState9.status;
        java.lang.String str14 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str10, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!" + "'", str13, "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str14, "Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap16 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo24 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap16, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet22);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap25 = gossipInfo24.endpoints;
        java.util.Set<java.lang.String> strSet26 = gossipInfo24.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap13, (java.lang.Double) 1.0d, strSet26);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo28 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", strMap10, (java.lang.Double) (-1.0d), strSet26);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo29 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap7, (java.lang.Double) (-1.0d), strSet26);
        java.lang.String str30 = gossipInfo29.sourceNode;
        java.util.Set<java.lang.String> strSet31 = gossipInfo29.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo32 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 1.0d, strSet31);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo33 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 10.0d, strSet31);
        java.lang.String str34 = gossipInfo33.sourceNode;
        java.util.Set<java.lang.String> strSet35 = gossipInfo33.endpointNames;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap36 = gossipInfo33.endpoints;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap37 = gossipInfo33.endpoints;
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str34, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNull(strMap37);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo12 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet10);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo13 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap1, (java.lang.Double) 1.0d, (java.util.Set<java.lang.String>) strSet10);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap14 = gossipInfo13.endpoints;
        java.lang.String str15 = gossipInfo13.sourceNode;
        java.lang.String str16 = gossipInfo13.sourceNode;
        java.util.Set<java.lang.String> strSet17 = gossipInfo13.endpointNames;
        java.lang.String str18 = gossipInfo13.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap19 = gossipInfo13.endpoints;
        java.util.Set<java.lang.String> strSet20 = gossipInfo13.endpointNames;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap21 = gossipInfo13.endpoints;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str15, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str18, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", "Endpoint :  / Status :  / DC :  / Rack : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : 0.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", "", "Endpoint :  / Status :  / DC : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version :  / Load : 10.0 / Severity : 1.0 / Host Id : Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi!", (java.lang.Double) 0.0d, "Endpoint : Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status :  / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack :  / Release version :  / Load : 0.0 / Severity : 0.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : hi! / Load : 0.0 / Severity : 10.0 / Host Id : Endpoint :  / Status :  / DC : hi! / Rack : hi! / Release version : hi! / Load : 10.0 / Severity : 100.0 / Host Id : hi! / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", (java.lang.Double) 100.0d);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap7 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap10 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo21 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap13, (java.lang.Double) 0.0d, (java.util.Set<java.lang.String>) strSet19);
        java.lang.String str22 = gossipInfo21.sourceNode;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<io.cassandrareaper.resources.view.NodesStatus.EndpointState>>> strMap23 = gossipInfo21.endpoints;
        java.util.Set<java.lang.String> strSet24 = gossipInfo21.endpointNames;
        java.util.Set<java.lang.String> strSet25 = gossipInfo21.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo26 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", strMap10, (java.lang.Double) 100.0d, strSet25);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo27 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("Endpoint : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Status : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / DC : hi! / Rack : Endpoint : hi! / Status : hi! / DC : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Rack : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 1.0 / Host Id : hi! / Tokens : hi! / Release version : hi! / Load : 10.0 / Severity : 10.0 / Host Id : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Tokens : ", strMap7, (java.lang.Double) 100.0d, strSet25);
        java.util.Set<java.lang.String> strSet28 = gossipInfo27.endpointNames;
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo29 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap4, (java.lang.Double) 100.0d, strSet28);
        io.cassandrareaper.resources.view.NodesStatus.GossipInfo gossipInfo30 = new io.cassandrareaper.resources.view.NodesStatus.GossipInfo("hi!", strMap1, (java.lang.Double) 10.0d, strSet28);
        java.lang.Class<?> wildcardClass31 = gossipInfo30.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("", "", "hi!", "", "hi!", (java.lang.Double) 1.0d, "hi!", "", (java.lang.Double) 0.0d);
        java.lang.String str10 = endpointState9.releaseVersion;
        java.lang.String str11 = endpointState9.toString();
        java.lang.String str12 = endpointState9.hostId;
        java.lang.String str13 = endpointState9.endpoint;
        java.lang.String str14 = endpointState9.dc;
        java.lang.String str15 = endpointState9.hostId;
        java.lang.String str16 = endpointState9.toString();
        java.lang.String str17 = endpointState9.endpoint;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str11, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : " + "'", str16, "Endpoint :  / Status : hi! / DC : hi! / Rack :  / Release version : hi! / Load : 0.0 / Severity : 1.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        io.cassandrareaper.resources.view.NodesStatus.EndpointState endpointState9 = new io.cassandrareaper.resources.view.NodesStatus.EndpointState("hi!", "", "", "", "hi!", (java.lang.Double) 10.0d, "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", "Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ", (java.lang.Double) (-1.0d));
        java.lang.String str10 = endpointState9.getRack();
        java.lang.String str11 = endpointState9.getDc();
        java.lang.String str12 = endpointState9.getDc();
        java.lang.String str13 = endpointState9.toString();
        java.lang.String str14 = endpointState9.rack;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : " + "'", str13, "Endpoint : hi! / Status : hi! / DC :  / Rack :  / Release version : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens :  / Load : -1.0 / Severity : 10.0 / Host Id :  / Tokens : Endpoint : hi! / Status :  / DC :  / Rack : hi! / Release version :  / Load : 1.0 / Severity : 0.0 / Host Id :  / Tokens : ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }
}

