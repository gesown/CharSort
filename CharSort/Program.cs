using System;
using System.Collections.Generic;
using CharSort.Facade;
using CharSort.Entity;

namespace CharSort
{
    class Program
    {
        static void Main(string[] args)
        {

            string strInput = args[0];
            IList<InChar> InChars = CSFacade.CreateInCharObjects(strInput);
            IList<InChar> OutChars = CSFacade.CalculateInCharOutObjects(InChars);
            string outCharString = CSFacade.GetOutCharString(OutChars);
            Console.WriteLine("String Input: " + strInput);
            Console.WriteLine("String Output: "+outCharString);
            Console.ReadLine();
        }
    }
}
