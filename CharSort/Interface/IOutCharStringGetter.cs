using System.Collections.Generic;
using CharSort.Entity;

namespace CharSort.Interface
{
    internal interface IOutCharStringGetter
    {
        string GetOutCharString(IList<InChar> outChars);
    }
}