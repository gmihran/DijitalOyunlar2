using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.OleDb;  // Access bağlantısı kurabilmek için.

namespace OyunVeriTabani
{
    public partial class Form1 : Form
    {
        OleDbConnection con;
        OleDbDataAdapter da;
        OleDbCommand komut;
        DataSet ds;
        public Form1()
        {
            InitializeComponent();
        }
        void veritabani()
        {
            con = new OleDbConnection("Provider=Microsoft.ACE.Oledb.12.0;Data Source=Uyelik.accdb");
            da = new OleDbDataAdapter("Select *from skor", con);
            ds = new DataSet();
            komut = new OleDbCommand();
            con.Open();
            da.Fill(ds, "skor");
            komut.CommandText = "insert into skor (id,kid,puan,sure,tarih) values ('" + 10 + "','" + 1 + "','" + puan + "','" + sure + "','" + DateTime.Today.Date + "')";
            komut.ExecuteNonQuery();
            
            //dataGridView1.DataSource = ds.Tables["skor"];
            con.Close();
        }
        private void btnBasla_Click(object sender, EventArgs e)
        {
            sure = 0;
            puan = 0;
            labelPuan.Text = puan.ToString();
            labelSure.Text = sure.ToString();
            timer1.Enabled = true;
            timer2.Enabled = true;

            panel1.BackgroundImage = Properties.Resources.arkaplan2;
        }
        int sure=0,puan=0;
        private void timer1_Tick(object sender, EventArgs e)
        {
            //Form alanına göre nesneyi ekrana getirme
            //int x = this.Width; //Formun genişliğine göre 
            //int y = this.Height; //Formun yüksekliğine göre
            int x = panel1.Width; //Panelin genişliğine göre
            int y = panel1.Height; //Panelin yüksekliğine göre
            Random rnd = new Random();
            int rndx = rnd.Next(0, x);
            int rndy = rnd.Next(0, y);
            
            kedi.Location = new Point(rndx, rndy);
            
            //kedi.Top = rndx;
            //kedi.Left = rndy;
            
           
        }

        private void kedi_Click(object sender, EventArgs e)
        {
            puan+=5;
            labelPuan.Text = puan.ToString();
        }

        private void timer2_Tick(object sender, EventArgs e)
        {
            sure += 1;
            labelSure.Text = sure.ToString();
            if (sure >= 10 && puan <= 10)
            {
                timer1.Enabled = false;
                timer2.Enabled = false;
                MessageBox.Show("Kaybettiniz.");
                veritabani();
                
            }
            else if (puan >= 10)
            {
                timer1.Enabled = false;
                timer2.Enabled = false;
                MessageBox.Show("Kazandınız.");
                veritabani();
            }
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void panel1_Click(object sender, EventArgs e)
        {
            puan--;
            labelPuan.Text = puan.ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            panel1.BackgroundImage = Properties.Resources.arkaplan;
        }
    }
}
