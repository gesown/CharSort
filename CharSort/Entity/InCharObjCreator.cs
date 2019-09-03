using System.Collections.Generic;
using CharSort.Interface;
using System.Text;

namespace CharSort.Entity
{
    internal class InCharObjCreator : IInCharObjCreator
    {
        public IList<InChar> CreateInCharObjects(string strInput)
        {
            ASCIIEncoding ae = new ASCIIEncoding();
            var strByteArray = ae.GetBytes(strInput);
            var strCharArray = strInput.ToCharArray();
            int ixIn = 0;
            var retValue = new List<InChar>();

            foreach (var item in strCharArray)
            {
                var ic = new InChar();
                ic.InCharSequenceIn = ixIn;
                ic.InCharInstance = strCharArray[ixIn];
                ic.InCharAscii = strByteArray[ixIn];
                ic.InCharAscii = item;
                retValue.Add(ic);
                ixIn++;
            }
            
            return retValue;
        }
    }
}