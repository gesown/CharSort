using System.Collections.Generic;
using CharSort.Entity;

namespace CharSort.Interface
{
    internal interface IInCharOutObjCalculator
    {
        IList<InChar> CalculateInCharOutObjects(IList<InChar> inChars);
    }
}