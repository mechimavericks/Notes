using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace BCATestProject
{
    public partial class FactorialCalculate : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void CalcFact(object sender, EventArgs e)
        {
            int num = int.Parse(number.Text);
            int fact = 1;
            for(int i=1;i<=num; i++)
            {
                fact *=i;
            }
            result.Text = "Factorial : " + fact;
        }
    }
}