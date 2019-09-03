using System.Collections.Generic;
using CharSort.Interface;
using System.Linq;

namespace CharSort.Entity
{
    internal class OutCharStringGetter : IOutCharStringGetter
    {
        public string GetOutCharString(IList<InChar> outChars)
        {
            char[] chrOutArray = outChars.Select(s => s.InCharInstance).ToArray();
            return new string(chrOutArray);
        }
    }
}