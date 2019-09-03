using CharSort.Entity;
using CharSort.Interface;
using CharSort.model;
using System;
using System.Collections.Generic;

namespace CharSort.Facade
{
    public static class CSFacade
    {
        static ICSModel csModel;
        internal static IList<InChar> CreateInCharObjects(string strInput)
        {
            IInCharObjCreator icobc = new InCharObjCreator();
            return icobc.CreateInCharObjects(strInput);
        }

        internal static ICSModel GetCSModel()
        {
            if (csModel == null) { csModel = new CSModel(); }
            return csModel;
        }

        internal static IList<InChar> CalculateInCharOutObjects(IList<InChar> inChars)
        {
            IInCharOutObjCalculator icobc = new InCharOutObjCalculator();
            return icobc.CalculateInCharOutObjects(inChars);
        }

        internal static string GetOutCharString(IList<InChar> outChars)
        {
            IOutCharStringGetter icobc = new OutCharStringGetter();
            return icobc.GetOutCharString(outChars);
        }
    }
}
