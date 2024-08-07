// Object * 126 Tau  ---  Double or Multiple Star  ---  OID=@824115   (@@19204,18)  ---  coobox=4976 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "126 Tau A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "126 Tau"
	Class           "B3IV"
	AbsMagn         -1.61 // 计算的值
	MassSol         6.31
	Radius          3284037.42834205 // 计算的值
	LumBol          2061
	Teff            17900

	BinaryOrbit     
	{
		Period          111.02
		Separation      47.7578780230228 // 0.245 asec
		Eccentricity    0.661
		Inclination     80.5
		AscendingNode   53.2
		Epoch           2428946.998559519648552
		ArgOfPericenter 220.9
		MeanAnomaly     0
	}
}

Star "126 Tau B"
{
	ParentBody      "126 Tau"
	Class           "B8.9?"
}

// Object * 127 Tau  ---  Double or Multiple Star  ---  OID=@823815   (@@19720,5)  ---  coobox=4952 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "127 Tau A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "127 Tau"
	Class           "B9"
	AbsMagn         1.17 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.202675449
		Eccentricity    0.00206388719
		Inclination     -0.323927164
		AscendingNode   0
		ArgOfPericenter -19.2359254
		MeanAnomaly     131.353519
	}
}

Star "127 Tau B"
{
	ParentBody      "127 Tau"
	Class           "M1.1?"
}