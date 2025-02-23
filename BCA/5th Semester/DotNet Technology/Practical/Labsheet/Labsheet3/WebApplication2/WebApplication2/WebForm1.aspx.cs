using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication2
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void CalculateSum(object sender, EventArgs e)
        {
            Console.WriteLine("Btn Clicked");
            int n1 = Convert.ToInt32(firstnum.Text);
            int n2= Convert.ToInt32(secondnum.Text);
            result.Text="Sum : "+(n1+n2);
        }
    }
}