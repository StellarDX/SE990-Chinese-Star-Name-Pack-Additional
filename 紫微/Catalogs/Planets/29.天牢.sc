// Object * 55 UMa  ---  Spectroscopic Binary  ---  OID=@1799214   (@@37350,0)  ---  coobox=12640 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "55 UMa A" {ParentBody "55 UMa"}
Remove "55 UMa Aa" {ParentBody "55 UMa A"}
Remove "55 UMa Ab" {ParentBody "55 UMa A"}
Remove "55 UMa B" {ParentBody "55 UMa"}
Barycenter "55 UMa Aab"
{
	ParentBody      "HIP 55266"
	BinaryOrbit     
	{
		PeriodDays      1872.7
		Separation      5.68759100386407
		Eccentricity    0.126
		Inclination     64.8
		AscendingNode   130.0
		Epoch           2448805
		ArgOfPericenter 43.9
		MeanAnomaly     0
	}
}

Star "55 UMa Aa"
{
	DateUpdated     "2024-05-02"
	ParentBody      "55 UMa Aab"
	Class           "A1V"
	AbsMagn         -0.09
	MassSol         2.0
	Radius          1221736.02854851 // log(g) = 4.25 cm/s^2
	LumBol          20.165604168961536 // 计算的值
	Teff            9230

	BinaryOrbit     
	{
		PeriodDays      2.5537985
		Eccentricity    0.323
		Epoch           2449602.368
		ArgOfPericenter 296.8
		MeanAnomaly     0
	}
}

Star "55 UMa Ab"
{
	ParentBody      "55 UMa Aab"
	Class           "A2V"
	MassSol         1.8
	Radius          1159040.56491054 // log(g) = 4.25 cm/s^2
	LumBol          15.064356235646793 // 计算的值
	Teff            8810
}

Star "55 UMa B"
{
	ParentBody      "HIP 55266"
	Class           "A1V"
	MassSol         2.1
	Radius          1251906.89335356 // log(g) = 4.25 cm/s^2
	LumBol          21.729843029330418 // 计算的值
	Teff            9290
}
