using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace BCATestProject
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void DispInfo(object sender, EventArgs e)
        {
            string fullname = name.Text;
            string add= address.Text;
            result.Text=("Name : "+fullname +" and Address: "+add);

        }
    }
}