using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace RandomSayi
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
        }
        
        int sayi1;
        Random rnd = new Random();
        private void button1_Click(object sender, EventArgs e)
        {
            int sayi2;
            
            do
            {
                sayi2 = rnd.Next(0, 3);
            } while (sayi1==sayi2);
            sayi1 = sayi2;
            listBox1.Items.Add(sayi2);  
            
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            label1.Text = DateTime.Today.Date.ToString();
            sayi1 = 5;
            timer1.Enabled = true;
        }
        
        private void timer1_Tick(object sender, EventArgs e)
        {
            int skor = 0;
            if (pictureBox1.Location == new Point(80, 190))
                skor += 1;
            if (pictureBox2.Location == new Point(155, 190))
                skor += 1;
            if (pictureBox3.Location == new Point(218, 190))
                skor += 1;
            if (skor == 2)
            {
                timer1.Enabled = false;
                MessageBox.Show("Tebrikler");
                
                    
            }
                

        }
    }
}
