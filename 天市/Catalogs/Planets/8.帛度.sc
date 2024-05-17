// Object * 96 Her  ---  Spectroscopic Binary  ---  OID=@2765409   (@@55174,7)  ---  coobox=19540 
// Object types: Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=88331
Barycenter "96 Her A"
{
	ParentBody      "96 Her"
	BinaryOrbit // VB6_Tok2022f TOK_56 Gr.3
	{
		Period          10.1349
		Separation      13.4454900901976 // 0.045
		Eccentricity    0.464
		Inclination     29.7
		AscendingNode   215.7
		Epoch           2460384.125092997681350
		ArgOfPericenter 263.4
		MeanAnomaly     0
	}
}

Star "96 Her Aa"
{
	DateUpdated     "2024-05-17"
	ParentBody      "96 Her A"
	Class           "B3IV"
	AbsMagn         -2.13 // 计算的值
	MassSol         4.62

	BinaryOrbit     
	{
		PeriodDays      12.4573
		Eccentricity    0.540
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2445895.410
		ArgOfPericenter 141.3
		MeanAnomaly     0
	}
}

Star "96 Her Ab"
{
	DateUpdated     "2024-05-17"
	ParentBody      "96 Her A"
	Class           "B3IV"
	MassSol         4.62
}

Barycenter "96 Her B"
{
	ParentBody      "96 Her"
}

Star "96 Her Ba"
{
	DateUpdated     "2024-05-17"
	ParentBody      "96 Her B"
	Class           "B4?"
	MassSol         4.08
	Oblateness      0

	BinaryOrbit     
	{
		PeriodDays      0.630
		// Separation      // 0.081 mas
	}
}

Star "96 Her Bb"
{
	ParentBody      "96 Her B"
	Class           "F1.2?"
	Oblateness      0
}
