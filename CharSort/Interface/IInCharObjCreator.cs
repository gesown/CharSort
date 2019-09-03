using System.Collections.Generic;
using CharSort.Entity;

namespace CharSort.Interface
{
    internal interface IInCharObjCreator
    {
        IList<InChar> CreateInCharObjects(string strInput);
    }
}