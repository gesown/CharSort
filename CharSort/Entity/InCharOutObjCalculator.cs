using System.Collections.Generic;
using CharSort.Interface;
using CharSort.Facade;
using System.Linq;

namespace CharSort.Entity
{
    internal class InCharOutObjCalculator : IInCharOutObjCalculator
    {
        public IList<InChar> CalculateInCharOutObjects(IList<InChar> inChars)
        {
            var csModel = CSFacade.GetCSModel();
            var retValue = new List<InChar>();
            var letters = inChars.Where(s => (s.InCharAscii >= csModel.startASCIILetters && s.InCharAscii <= csModel.endASCIILetters)).ToList();
            var numbers = inChars.Where(s =>( s.InCharAscii >= csModel.startASCIINumbers && s.InCharAscii <= csModel.endASCIINumbers)).ToList();
            if (letters.Count == numbers.Count)
            {
                for (int i = 0; i < letters.Count; i++)
                {
                    retValue.Add(letters[i]);
                    retValue.Add(numbers[i]);
                }
                return retValue;
            }
            foreach (var item in letters)
            {
                retValue.Add(item);
            }
            foreach (var item in numbers)
            {
                retValue.Add(item);
            }

            return retValue;
        }
    }
}